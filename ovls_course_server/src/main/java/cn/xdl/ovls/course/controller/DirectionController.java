package cn.xdl.ovls.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.xdl.ovls.course.entity.ResponseResult;
import cn.xdl.ovls.course.service.DirectionService;

@RestController
public class DirectionController {

	@Autowired
	private DirectionService directionService;
	
	@RequestMapping(value={"/direction"},method=RequestMethod.GET)
	public ResponseResult loadAll(){
		return directionService.loadAll();
	}
	
}
