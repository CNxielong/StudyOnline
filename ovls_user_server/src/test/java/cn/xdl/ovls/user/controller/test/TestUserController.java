package cn.xdl.ovls.user.controller.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import cn.xdl.ovls.user.UserServiceBootApplication;
import cn.xdl.ovls.user.controller.UserController;
/**
 * 
 * @Title: TestUserController  
 * @Description: TODO(MockMVC测试)  
 * @author X-Dragon  
 * @version V1.0  
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={UserServiceBootApplication.class})
public class TestUserController {

	@Autowired
	private UserController userController;
	private MockMvc mockmvc;
	
	@Before
	public void init(){
		//创建MockMVC对象
		mockmvc = MockMvcBuilders.standaloneSetup(userController).build();
	}
	
	@Test
	public void test1() throws Exception{
		MockHttpServletRequestBuilder postRequest = MockMvcRequestBuilders.post("/user/token") //设置提交方式
				.param("name", "xielong") //设置变量
				.param("password", "123456");
		//执行请求,获取返回结果
		MvcResult mvcResult = mockmvc.perform(postRequest).andReturn();
		//获取返回结果内容打印输出
		String body = mvcResult.getResponse().getContentAsString();
		System.out.println("查询结果是"+body);

	}
	
	@Test
	public void test2() throws Exception{

		//创建post请求/user/token，指定请求参数name和password
		RequestBuilder postRequest = MockMvcRequestBuilders.post("/user/token")
			.param("name", "aaa")
			.param("password", "bfe8eaac58a4bc2fd197359ad70ddab8");
		//执行请求,获取返回结果
		MvcResult mvcResult = mockmvc.perform(postRequest).andReturn();
		//获取返回结果内容打印输出
		String body = mvcResult.getResponse().getContentAsString();
		System.out.println(body);
	}
	
	@Test
	public void test3() throws Exception{
		
		//创建post请求/user/token，指定请求参数name和password
		RequestBuilder postRequest = MockMvcRequestBuilders.post("/user/token")
			.param("name", "scott")
			.param("password", "123");
		//执行请求,获取返回结果
		MvcResult mvcResult = mockmvc.perform(postRequest).andReturn();
		//获取返回结果内容打印输出
		String body = mvcResult.getResponse().getContentAsString();
		System.out.println(body);
	}
	
	@Test
	public void test4() throws Exception{
		MockHttpServletRequestBuilder postRequest = MockMvcRequestBuilders.post("/user/register")
				.param("name", "xielong")
				.param("password", "123456");
		//执行请求,获取返回结果
		MvcResult mvcResult = mockmvc.perform(postRequest).andReturn();
		//获取返回结果内容打印输出
		String body = mvcResult.getResponse().getContentAsString();
		System.out.println(body);

	}
}
