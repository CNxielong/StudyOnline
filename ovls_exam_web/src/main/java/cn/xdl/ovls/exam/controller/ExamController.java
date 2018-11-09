package cn.xdl.ovls.exam.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import cn.xdl.ovls.exam.entity.ResponseResult;
import cn.xdl.ovls.exam.entity.Subject;

@Controller
public class ExamController {

	@RequestMapping("/exam/home.html")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		return mav;
	}

	@Autowired // 自动配置已经创建了该对象
	private RestTemplateBuilder templateBuilder;

	@RequestMapping("/exam/subject")
	public ModelAndView subjectLoadAll() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");//返回
		RestTemplate restTemplate = templateBuilder.build();
		//调用后台Rest服务,将输入放入ModelAndView
		ResponseResult responseResult = restTemplate.getForObject("http://localhost:8882/subject",
				ResponseResult.class);
		System.out.println(responseResult);
		Object data = responseResult.getData();
//		System.out.println(data.getClass());//java.util.ArrayList
//		ArrayList directions =(ArrayList) data;
//		System.out.println(directions.get(1).getClass());//class java.util.LinkedHashMap
		ArrayList<LinkedHashMap<String,Integer>> directions =(ArrayList<LinkedHashMap<String,Integer>>) data;
		
//		Set keySet = directions.get(0).keySet();//获取key的结果集
//		for (Object object : keySet) {
//			System.out.println("Map的KEY类型:"+object.getClass());
//			break;
//		}
//		Collection values = directions.get(0).values();//获取values的结果集
//		for (Object object : values) {
//			System.out.println("Map的Value类型:"+object.getClass());
//			break;
//		}
//		for (LinkedHashMap<String, Integer> linkedHashMap : directions) {
//			linkedHashMap.
//		}
		System.out.println();//TODO
		
		//调用ovls_paper_server的服务根据学科查询试卷
		//循环遍历得到学科subject 
		//根据subjectId得到试卷
		return mav;
	}
}
