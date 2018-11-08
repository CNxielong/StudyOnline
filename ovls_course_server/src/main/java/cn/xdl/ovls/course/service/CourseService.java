package cn.xdl.ovls.course.service;

import cn.xdl.ovls.course.entity.ResponseResult;

public interface CourseService {
	 ResponseResult loadFreeCourse(int size);
	 ResponseResult loadCourse(int id);
	 ResponseResult loadCourseDetailChapters(int id);
}
