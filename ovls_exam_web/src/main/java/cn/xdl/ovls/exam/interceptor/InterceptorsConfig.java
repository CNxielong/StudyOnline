package cn.xdl.ovls.exam.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorsConfig extends WebMvcConfigurerAdapter{
	
	
	@Autowired
	private CheckLoginInterceptor checkLogin;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(checkLogin).addPathPatterns("/paper/subject/*");
	}
}
