package cn.xdl.ovls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/study")//提取公用的请求路径
public class StudyController {
	@RequestMapping("/index.html")
	public String toIndex(){
		return "index";
	}
}
