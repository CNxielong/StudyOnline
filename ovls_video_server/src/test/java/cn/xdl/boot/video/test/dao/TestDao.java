package cn.xdl.boot.video.test.dao;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.xdl.boot.video.VideoServerBootApplicaiton;
import cn.xdl.boot.video.dao.VideoMapper;
import cn.xdl.boot.video.entity.Video;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=VideoServerBootApplicaiton.class)
public class TestDao {
	
	@Autowired
	private VideoMapper videoMapper;
	
	@Test
	public void test1(){
		List<Video> videos = videoMapper.selectByChapterId(1);
		for (Iterator iterator = videos.iterator(); iterator.hasNext();) {
			Video video = (Video)iterator.next();
			System.out.println(video.getName());
		}
	}
}
