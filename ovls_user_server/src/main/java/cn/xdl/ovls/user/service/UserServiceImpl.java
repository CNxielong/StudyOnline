package cn.xdl.ovls.user.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
		if(ok){// token通过验证
			result.setStatus(1);
			result.setMsg("token令牌合法");
			// 将最后一次操作时间更新下
			tokenManager.updateLastOperate(token);
		}else{
			result.setStatus(2);
			result.setMsg("token不合法");
		}
		return result;
	}

	@Override
	public ResponseResult register(String name, String password) {
		// TODO Auto-generated method stub
		ResponseResult result = new ResponseResult();
		User user = new User();
		// 判断name是否已经存在
		boolean isExists = NameIsExists(name);
		if(isExists){// 如果冲突
			result.setMsg("姓名已经存在了");
			result.setStatus(4);
		}else{
			user.setName(name);
			String salt = UUID.randomUUID().toString().substring(0, 8);//私盐 UUID随机数前八位
			user.setSalt(salt);
			user.setPassword(Md5Utils.encryptPassword(password, salt));//MD5加密
			userDao.insert(user);
			result.setMsg("注册成功");
			result.setStatus(1);
			result.setData(user);
		}
		return result;
	}

	/**
	 * 
	 * @Title: UserServiceImpl.java  
	 * @Description: TODO(检测Name是否有冲突)   
	 * @param: @param name
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	public boolean NameIsExists(String name){
		User user = userDao.selectByName(name);
		if(user != null){//有冲突
			return true;
		}
		return false;//没有冲突
	}
	
}
