

package cn.xdl.ovls.course.dao.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.xdl.ovls.course.CourseServiceBootApplication;
import cn.xdl.ovls.course.dao.SubjectMapper;
import cn.xdl.ovls.course.entity.Subject;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=CourseServiceBootApplication.class)

public class TestSubjectMapper {
	@Autowired
	private SubjectMapper subjectMapper;

	@Test
	public void test1() {
		System.out.println("abc");
		// TODO Auto-generated method stub
		List<Subject> selectByDirectionId = subjectMapper.selectByDirectionId(1);
		for (Subject subject : selectByDirectionId) {
			System.out.println(subject);
		}
	}
	
	@Test
	public void test2(){
		List<Subject> list = subjectMapper.selectByDirectionId(2);
		for (Subject subject : list) {
			System.out.println(subject);
		}
	}

}
