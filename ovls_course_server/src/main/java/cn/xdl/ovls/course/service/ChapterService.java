package cn.xdl.ovls.course.service;

import java.util.List;

import cn.xdl.ovls.course.entity.Chapter;

public interface ChapterService {
	Chapter selectByPrimaryKey(int chapterId);
	List<Chapter> selectByCourseId(int courseId);
}
