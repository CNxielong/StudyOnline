package cn.xdl.ovls.exam.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import cn.xdl.ovls.exam.entity.ResponseResult;

@Controller
public class ExamController {
	
	@Autowired
	private RestTemplateBuilder restBuilder;
	
	@RequestMapping("/exam/home.html")
	public ModelAndView toHome(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		RestTemplate restTemplate = restBuilder.build();
		ResponseResult subjectResult  = restTemplate.getForObject("http://localhost:8882/subject", ResponseResult.class);
		System.out.println("subjectResult:"+subjectResult);
		List<Map> subjectList  = (List) subjectResult.getData();
		for(int i=subjectList .size()-1;i>=0;i--){
			Map subject  = subjectList.get(i);
			int subjectId  = (int) subject.get("id");
			ResponseResult paperResult = restTemplate.getForObject("http://localhost:8884/paper/subject/"+subjectId,ResponseResult.class);
			List<Map> paperList=new ArrayList<>();
			subject.put("papers",paperList);
			if(paperResult.getStatus()==1){//有试卷
				
				paperList= (List)paperResult.getData();//获取试卷集合
				System.out.println("paperList:"+paperList);
				subject.put("papers", paperList);
				
			}else if(paperResult.getStatus()==2){//没有试卷
				subjectList.remove(subject);
			}
		}
		mav.getModel().put("subjects", subjectList);
		return mav;
		}
	

	@RequestMapping("exam/practice-testing.html")
	public ModelAndView toPracticeTesting(HttpServletRequest request,ModelMap map){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("practice-testing");
		String knowledgeIds = request.getParameter("id")==null?"666":request.getParameter("id");
		int  knowledgeId = Integer.parseInt(knowledgeIds);
		if(knowledgeId==666){
			RestTemplate restTemplate = restBuilder.build();
			ResponseResult QuestionResult  = restTemplate.getForObject("http://localhost:8884/question/knowledge/"+knowledgeId, ResponseResult.class);
			List<Map> QuestionList = (List) QuestionResult.getData();
			mav.getModel().put("questions", QuestionList);
		}else{
		//加载所有考试试题 在跟局试题id查询所有的答案
		RestTemplate restTemplate = restBuilder.build();
		ResponseResult QuestionResult  = restTemplate.getForObject("http://localhost:8884/question/knowledge/"+knowledgeId, ResponseResult.class);
		List<Map> QuestionList = (List) QuestionResult.getData();
		mav.getModel().put("questions", QuestionList);
		}
		
		return mav;
		
	}
	
	@RequestMapping("exam/paper-exam-finished.html")
	public ModelAndView topPaperExamFinished(HttpServletRequest Request){
		ModelAndView mav = new ModelAndView();
		String answer = Request.getParameter("answer");
			if(answer.equals("aa")){
				String reportId = Request.getParameter("reportId");		
				RestTemplate restTemplate = restBuilder.build();
				ResponseResult recordResult = restTemplate.getForObject("http://localhost:8884/question//PaperExamRecord/reportId/"+reportId, ResponseResult.class);
				Map record = (Map) recordResult.getData();
				List<Map> records = new ArrayList();
				records.add(record);		
				mav.getModel().put("records", records);
				mav.setViewName("paper-exam-finished");
			}else{
				String knowledgeId = Request.getParameter("knowledgeId");		
				RestTemplate restTemplate = restBuilder.build();
				ResponseResult recordResult = restTemplate.getForObject("http://localhost:8884/question/PaperExamRecord/"+knowledgeId+","+answer, ResponseResult.class);
				Map record = (Map) recordResult.getData();
				List<Map> records = new ArrayList();
				records.add(record);
				mav.getModel().put("records", records);
				mav.setViewName("paper-exam-finished");
			}
		return mav;
	}
	
		
	@RequestMapping("exam/paper-exam-finish-report.html")
	public ModelAndView topPaperExamFinishedReport(HttpServletRequest Request){
		ModelAndView mav = new ModelAndView();
		String knowledgeName = Request.getParameter("knowledgeName");		
		//根据试卷名字查询内容
		RestTemplate restTemplate = restBuilder.build();
		ResponseResult recordResult = restTemplate.getForObject("http://localhost:8884/question/Details/"+knowledgeName, ResponseResult.class);
		List<Map> records = (List) recordResult.getData();
		mav.getModel().put("records", records);
		mav.setViewName("paper-exam-finish-report");
		return mav;
	}
	
	
	@RequestMapping("exam/usercenter.html")
	public ModelAndView toUsercenter(){
		ModelAndView mav = new ModelAndView();
		RestTemplate restTemplate = restBuilder.build();
		
		
		mav.setViewName("usercenter");
		return mav;
	}
	
	
	@RequestMapping("exam/analysis.html")
	public ModelAndView toAnalysis(){
		ModelAndView mav = new ModelAndView();
		RestTemplate restTemplate = restBuilder.build();
		mav.setViewName("analysis");
		return mav;
	}
	
	@RequestMapping("exam/exam-history.html")
	public ModelAndView toHistory(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("exam-history");
		return mav;
	}

	

}
