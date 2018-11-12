package cn.xdl.ovls.exam.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.xdl.ovls.exam.entity.ResponseResult;




@Component
public class CheckLoginInterceptor implements HandlerInterceptor{

	@Autowired
	private RestTemplateBuilder restBuilder;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//获取请求带过来的token
		String token = request.getParameter("token");
		System.out.println("调用/user/token服务检查token是否合法"+token);
		response.setContentType("application/json;charset=UTF-8");
		
		
		if(token != null && !"".equals(token)){
			//调用/user/token服务检查token是否合法,合法就返回true,不合法返回false
			RestTemplate restTemplate = restBuilder.build();
			//调用ovls_course_server的服务查询所有学科信息
			ResponseResult userResult  = restTemplate.getForObject(
				"http://localhost:8881/user/token?token="+token, ResponseResult.class);
			if(userResult.getStatus()==1){//通过验证，表示token合法
				return true;
			}
		}
		//未通过验证
		PrintWriter out = response.getWriter();
		out.println("{\"stauts\":2,\"msg\":\"不合法用户\"}");
		out.close();
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
