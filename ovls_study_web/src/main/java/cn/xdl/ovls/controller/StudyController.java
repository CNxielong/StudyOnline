package cn.xdl.ovls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/study") // 提取公用的请求路径
public class StudyController {
	@RequestMapping("/index.html")
	public String toIndex() {
		return "index";
	}

	@RequestMapping("/course.html")
	public String toCourse(@RequestParam(name ="cid") int cid) {
		return "course";
	}
	
}
