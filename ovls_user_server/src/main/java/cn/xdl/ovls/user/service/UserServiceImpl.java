package cn.xdl.ovls.user.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.xdl.ovls.user.dao.UserMapper;
import cn.xdl.ovls.user.entity.ResponseResult;
import cn.xdl.ovls.user.entity.User;
import cn.xdl.ovls.user.util.Md5Utils;
//import cn.xdl.ovls.user.util.Md5Utils;
//import cn.xdl.ovls.user.util.TokenUtil;
import cn.xdl.ovls.user.util.TokenUtil;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userDao;

	@Override
	public ResponseResult createToken(String name, String password) {
		ResponseResult result = new ResponseResult();
		// 检测账号和密码的正确性
		User user = userDao.selectByName(name);
		if (user == null) {
			result.setStatus(2);
			result.setMsg("用户不存在");
		} else {
			System.out.println("user:" + user);
			// 检测密码
			// 将用户输入密码+salt进行MD5处理
			String md5Password = Md5Utils.encryptPassword(password, user.getSalt());
			if (!user.getPassword().equals(md5Password)) {
				result.setStatus(3);
				result.setMsg("密码不正确");
			} else {
				result.setStatus(1);
				result.setMsg("登录成功");
				// 生成一个token
				String token = TokenUtil.generatorToken(user.getId());
				Map<String, Object> data = new HashMap<String, Object>();//放入一个Map
				data.put("token", token);
				result.setData(data);
			}
		}

		return result;
	}

	// @Override
	// public ResponseResult register(String name, String password) {
	// ResponseResult result = new ResponseResult();
	// User user = new User();
	// user.setName(name);
	//
	// String s1 = String.valueOf(Math.random()*10000);
	// String salt = s1.substring(0, s1.indexOf("."));
	// user.setSalt(salt);//加盐
	// user.setPassword(Md5Utils.md5(password+user.getSalt()));
	//
	// //判断用户名是否已经重复
	// User userSel = userDao.selectByName(name);
	// if( userSel != null ){//用户名已存在
	// result.setStatus(2);
	// result.setMsg("用户已存在");
	// }else{//用户不存在
	// userDao.insert(user);//插入用户
	// result.setStatus(1);
	// result.setMsg("注册成功");
	// result.setData(user);
	// }
	//
	// return result;
	// }

}
