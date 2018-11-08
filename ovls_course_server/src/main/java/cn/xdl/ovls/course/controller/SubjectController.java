package cn.xdl.ovls.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.xdl.ovls.course.entity.ResponseResult;
import cn.xdl.ovls.course.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseResult loadAll(){
		return subjectService.loadAll();
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseResult loadCourseDetail(
			@PathVariable("id") int id){
		ResponseResult result = subjectService.selectByDirectionId(id);
		return result;
	}
}
