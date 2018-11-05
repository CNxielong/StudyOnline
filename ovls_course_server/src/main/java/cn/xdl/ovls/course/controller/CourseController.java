package cn.xdl.ovls.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.xdl.ovls.course.entity.ResponseResult;
import cn.xdl.ovls.course.service.CourseService;

//@Controller //不能只用@Controller 否则会取不到数据
@RestController 
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	@RequestMapping(value="/free",method=RequestMethod.GET)
	@ResponseBody //默认返回JSON格式
	public ResponseResult loadFreeCourse(//输入top 默认加载五门课程
			@RequestParam(name="top",required=false,defaultValue="5") int size){
		ResponseResult result = courseService.loadFreeCourse(size);
		System.out.println(result);
		return result;
	}
}
