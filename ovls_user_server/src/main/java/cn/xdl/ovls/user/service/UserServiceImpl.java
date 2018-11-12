package cn.xdl.ovls.user.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.ovls.user.dao.UserMapper;
import cn.xdl.ovls.user.entity.ResponseResult;
import cn.xdl.ovls.user.entity.User;
import cn.xdl.ovls.user.util.Md5Utils;
import cn.xdl.ovls.user.util.TokenManager;
//import cn.xdl.ovls.user.util.Md5Utils;
//import cn.xdl.ovls.user.util.TokenUtil;
import cn.xdl.ovls.user.util.TokenUtil;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userDao;
	
	@Autowired
	private TokenManager tokenManager;
	
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
//				System.out.println("userService获得的Token:"+token);
				tokenManager.addToken(token, user.getId());
				Map<String, Object> data = new HashMap<String, Object>();//放入一个Map
				data.put("token", token);
				result.setData(data);
			}
		}

		return result;
	}

	@Override
	public ResponseResult checkToken(String token) {
		ResponseResult result = new ResponseResult();
		boolean ok = tokenManager.validate(token);
		if(ok){//token通过验证
			result.setStatus(1);
			result.setMsg("token令牌合法");
			//将最后一次操作时间更新下
			tokenManager.updateLastOperate(token);
		}else{
			result.setStatus(2);
			result.setMsg("token不合法");
		}
		return result;
	}


}
