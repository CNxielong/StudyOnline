package cn.xdl.ovls.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.ovls.course.dao.ChapterMapper;
import cn.xdl.ovls.course.entity.Chapter;

@Service
public class ChapterServiceImpl implements ChapterService {

	@Autowired
	private ChapterMapper chapterMapper;
	
	@Override
	public Chapter selectByPrimaryKey(int chapterId) {
		Chapter chapter = chapterMapper.selectByPrimaryKey(chapterId);
		return chapter;
	}

	@Override
	public List<Chapter> selectByCourseId(int courseId) {
		// TODO Auto-generated method stub
		List<Chapter> chapters = chapterMapper.selectByCourseId(courseId);
		return chapters;
	}

	

}
