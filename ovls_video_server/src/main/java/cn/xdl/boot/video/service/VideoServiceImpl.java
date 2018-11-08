package cn.xdl.boot.video.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.boot.video.dao.VideoMapper;
import cn.xdl.boot.video.entity.Video;

@Service
public class VideoServiceImpl implements VideoService {

	@Autowired
	private VideoMapper videoMapper;
	@Override
	public List<Video> selectByChapterId(int chapterId) {
		List<Video> list = videoMapper.selectByChapterId(chapterId);
		return list;
	}

}
