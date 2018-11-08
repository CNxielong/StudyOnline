package cn.xdl.boot.video.service;

import java.util.List;

import cn.xdl.boot.video.entity.Video;

public interface VideoService {
	List<Video> selectByChapterId(int chapterId);
}
