package cn.xdl.ovls.course.controller.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import cn.xdl.ovls.course.CourseServiceBootApplication;
import cn.xdl.ovls.course.controller.CourseController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=CourseServiceBootApplication.class)
public class TestCourseController {
	@Autowired
	private CourseController courseController;
	private MockMvc mockmvc;
	
	@Before
	public void init(){
		//创建MockMVC对象
		mockmvc = MockMvcBuilders.standaloneSetup(courseController).build();
	}
	
	@Test
	public void test1() throws Exception{
		MockHttpServletRequestBuilder getRequest = MockMvcRequestBuilders
				.get("/course/free").param("top", "2"); //设置提交方式 和参数

		//执行请求,获取返回结果
		MvcResult mvcResult = mockmvc.perform(getRequest).andReturn();
		//获取返回结果内容打印输出
		String body = mvcResult.getResponse().getContentAsString();
		System.out.println("查询结果是"+body);

	}
	
	@Test
	public void test2() throws Exception{
		MockHttpServletRequestBuilder getRequest = MockMvcRequestBuilders
				.get("/course/free"); //默认加载五条
		//执行请求,获取返回结果
		MvcResult mvcResult = mockmvc.perform(getRequest).andReturn();
		//获取返回结果内容打印输出
		String body = mvcResult.getResponse().getContentAsString();
		System.out.println("查询结果是"+body);

	}
}
