package cn.xdl.ovls.paper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.xdl.ovls.paper.service.PaperService;
import cn.xdl.ovls.paper.util.ResponseResult;

@RestController
public class PaperController {

	@Autowired
	private PaperService paperService;
	
	@RequestMapping(method=RequestMethod.GET,value="/paper/subject/{subjectId}")
	public ResponseResult loadSubjectPapers(@PathVariable("subjectId") int subjectId){
		ResponseResult result = paperService.selectPaperBySubjectId(subjectId);
	System.out.println(result);
		return result;
	} 
	
}
