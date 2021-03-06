package cn.xdl.ovls.course.service;

import java.util.List;

import javax.naming.spi.ResolveResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.xdl.ovls.course.dao.CourseMapper;
import cn.xdl.ovls.course.entity.Course;
import cn.xdl.ovls.course.entity.ResponseResult;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseMapper courseMapper;
	

	@Override
	public ResponseResult loadFreeCourse(int size) {
		PageHelper.startPage(1, size);
		List<Course> list = courseMapper.selectFreePriceCourse();
		ResponseResult result = new ResponseResult();
		if(list.isEmpty()){//如果没取到数据
			result.setStatus(2);//数据不存在
			result.setMsg("未找到记录");
		}else{
			result.setStatus(1);//数据存在
			result.setMsg("查找成功");
			result.setData(list);
		}
		return result;
	}


	@Override
	public ResponseResult loadCourse(int id) {
		Course course = courseMapper.selectByPrimaryKey(id);
		ResponseResult result = new ResponseResult();
		if(course == null){//如果没取到数据
			result.setStatus(2);//数据不存在
			result.setMsg("未找到记录");
		}else{
			result.setStatus(1);//数据存在
			result.setMsg("查找成功");
			result.setData(course);
		}
		return result;
	}


	@Override
	public ResponseResult loadCourseDetailChapters(int id) {
		Course course = courseMapper.selectDetailChaptersByPrimaryKey(id);
		ResponseResult result = new ResponseResult();
		if(course == null){//如果没取到数据
			result.setStatus(2);//数据不存在
			result.setMsg("未找到记录");
		}else{
			result.setStatus(1);//数据存在
			result.setMsg("查找成功");
			result.setData(course);
		}
		return result;
	}


	@Override
	public ResponseResult searchCourses(String nameOrIntro) {
		List<Course> coursesList = courseMapper.searchCourses(nameOrIntro);
		ResponseResult result = new ResponseResult();
		if(0 == coursesList.size()){//如果没取到数据
			result.setStatus(2);//数据不存在
			result.setMsg("未找到记录");
		}else{
			result.setStatus(1);//数据存在
			result.setMsg("查找成功");
			result.setData(coursesList);
		}
		return result;
	}

}
