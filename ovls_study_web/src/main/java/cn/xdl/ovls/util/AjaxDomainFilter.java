package cn.xdl.ovls.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

@WebFilter(servletNames={"dispatcherServlet"})
//@WebFilter(urlPatterns="/*");//报错
public class AjaxDomainFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("------WEB--AjaxDomainFilter-----------");
		//设置允许跨域响应的参数
		HttpServletResponse httpRresponse = (HttpServletResponse)response;
		httpRresponse.setHeader("Access-Control-Allow-Origin", "*");
		httpRresponse.setHeader("Access-Control-Allow-Methods", "GET,POST,DELETE,PUT");
		//放过请求处理
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
