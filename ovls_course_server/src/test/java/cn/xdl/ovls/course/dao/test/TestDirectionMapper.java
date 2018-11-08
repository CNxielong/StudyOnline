package cn.xdl.ovls.course.dao.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.pagehelper.PageHelper;

import cn.xdl.ovls.course.CourseServiceBootApplication;
import cn.xdl.ovls.course.dao.ChapterMapper;
import cn.xdl.ovls.course.dao.CourseMapper;
import cn.xdl.ovls.course.dao.DirectionMapper;
import cn.xdl.ovls.course.entity.Chapter;
import cn.xdl.ovls.course.entity.Course;
import cn.xdl.ovls.course.entity.Direction;
import cn.xdl.ovls.course.entity.Subject;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=CourseServiceBootApplication.class)
public class TestDirectionMapper {
	
	@Autowired
	private DirectionMapper directionMapper;

	@Test
	public void test1(){
		Direction selectContainsSubjectByPrimaryKey = directionMapper.selectContainsSubjectByPrimaryKey(1);
		List<Subject> subjects = selectContainsSubjectByPrimaryKey.getSubjects();
		for (Subject subject : subjects) {
			System.out.println(subject.getName());
		}
	}
	
//	@Test
//	public void test2(){
//		Course course = courseMapper.selectDetailChaptersByPrimaryKey(1);
//		List<Chapter> chapters = course.getChapters(); 
//		for (Chapter chapter : chapters) {
//			System.out.println(chapter.getId()+":"+chapter.getName());
//		}
//	}
}
