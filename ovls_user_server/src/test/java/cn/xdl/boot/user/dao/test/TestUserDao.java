package cn.xdl.boot.user.dao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.xdl.ovls.user.UserServiceBootApplication;
import cn.xdl.ovls.user.dao.UserMapper;
import cn.xdl.ovls.user.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=UserServiceBootApplication.class)
public class TestUserDao {

	@Autowired
	private UserMapper userDao;

	
	@Test
	public void TestSelect(){
		User user = userDao.selectByPrimaryKey(1);
		if(user != null){
			System.out.println(user);
		}else{
			System.out.println("查询结果为空");
		}
	}
	
}
