package cn.xdl.ovls.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 
 * @Title: UserServerBootApplicaiton  
 * @Description: TODO(user服务端)  
 * @author X-Dragon  
 * @date 2018年11月3日 下午12:44:54 
 * @version V1.0  
 *
 */
@SpringBootApplication
@ServletComponentScan //引入组件扫描
@MapperScan(basePackages="cn.xdl.ovls.user.dao")
public class UserServiceBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceBootApplication.class, args);
	}

}
