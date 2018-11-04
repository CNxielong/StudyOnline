package cn.xdl.ovls.user.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.xdl.ovls.user.entity.ResponseResult;
import cn.xdl.ovls.user.service.UserServiceImpl;

@RestController
public class UserController {
	
	@Resource
	private UserServiceImpl userServiceImpl;

	@RequestMapping(value="/user/token",method=RequestMethod.POST)
	public ResponseResult createToken(String name,String password,HttpSession session){
		ResponseResult result = userServiceImpl.createToken(name, password);
		//如果登录成功 放入TOKEN
		if(result.getStatus() ==1 ){
			Map<String, Object> data = (Map<String, Object>)result.getData();//UserServiceImpl登陆成功后结果result.data放入一个MAP
			session.setAttribute("token", data.get("token"));
		}
		return result;
	}
	
//	@RequestMapping(value="/user/register",method=RequestMethod.POST)
//	public ResponseResult register(String name,String password){
//		return userServiceImpl.register(name, password);
//	}
}
