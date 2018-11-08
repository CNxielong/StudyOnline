package cn.xdl.boot.video.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.xdl.boot.video.entity.ResponseResult;
import cn.xdl.boot.video.entity.Video;
import cn.xdl.boot.video.service.VideoService;

@RestController
@RequestMapping("/video")
public class VideoController {

	@Autowired
	private VideoService videoService;
	
	@RequestMapping(value="/chapter/{chapterId}",method=RequestMethod.GET)
	public ResponseResult selectByChapterId(@PathVariable("chapterId") int chapterId){
		System.out.println("Video Controller");
		ResponseResult result = new ResponseResult();
		List<Video> list = videoService.selectByChapterId(chapterId);
		if(list.isEmpty()){//未取到数据
			result.setStatus(2);
			result.setMsg("未取到数据");
		}else{
			result.setStatus(1);
			result.setMsg("取到数据");
			result.setData(list);
		}
		return result;
	}
}
