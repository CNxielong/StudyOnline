package cn.xdl.ovls.user.service;

import cn.xdl.ovls.user.entity.ResponseResult;

public interface UserService {
	/**
	 * 用户登录
	 * @param name 姓名
	 * @param password 密码	
	 * */
	public ResponseResult createToken(String name,String password);
	
	/**
	 * 用户注册
	 * @param name 姓名
	 * @param password 密码	
	 * */
	public ResponseResult register(String name,String password);
	
	/**
	 * 
	 * @Title: UserService.java  
	 * @Description: TODO(检测登录是否有效)   
	 * @param: @param token
	 * @param: @return      
	 * @return: ResponseResult      
	 */
	public ResponseResult checkToken(String token);
	
	
}
