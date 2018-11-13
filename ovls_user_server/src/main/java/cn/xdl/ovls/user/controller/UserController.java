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
		return result;
	}
	
	@RequestMapping(value="/user/token",method=RequestMethod.GET)
	public ResponseResult checkToken(String token){
		System.out.println("Token校验开始:"+token);
		ResponseResult result = userServiceImpl.checkToken(token);
		System.out.println("Token校验结束:"+token+"  "+result);
		return result;
	}
	
	@RequestMapping(value="/user/register",method=RequestMethod.POST)
	public ResponseResult register(String name,String password){
		return userServiceImpl.register(name, password);
	}
}
