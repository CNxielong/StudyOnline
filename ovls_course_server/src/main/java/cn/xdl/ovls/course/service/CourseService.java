package cn.xdl.ovls.course.service;

import cn.xdl.ovls.course.entity.ResponseResult;

public interface CourseService {
	/**
	 * 
	 * @Title: CourseService.java  
	 * @Description: TODO(加载免费好课)   
	 * @param: @param size
	 * @param: @return      
	 * @return: ResponseResult      
	 * @throws
	 */
	 ResponseResult loadFreeCourse(int size);
	 /**
	  * 
	  * @Title: CourseService.java  
	  * @Description: TODO(根据ID查询课程)   
	  * @param: @param id
	  * @param: @return      
	  * @return: ResponseResult      
	  * @throws
	  */
	 ResponseResult loadCourse(int id);
	 /**
	  * 
	  * @Title: CourseService.java  
	  * @Description: TODO(根据传入的id查询)   
	  * @param: @param id
	  * @param: @return      
	  * @return: ResponseResult      
	  * @throws
	  */
	 ResponseResult loadCourseDetailChapters(int id);
	 
	 /**
	  * 
	  * @Title: CourseService.java  
	  * @Description: TODO(根据课程的name或Intro搜索相关课程)   
	  * @param: @param nameOrIntro
	  * @param: @return      
	  * @return: ResponseResult      
	  * @throws
	  */
	 ResponseResult searchCourses(String nameOrIntro);
}
