package cn.xdl.ovls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 * @Title: StudyWebBootApplication  
 * @Description: TODO(前端学习系统页面 主启动类)  
 * @author X-Dragon  
 * @date 2018年11月3日 下午2:06:57 
 * @version V1.0  
 *
 */
@EnableDiscoveryClient//启用eureka服务查找和注册
@SpringBootApplication
public class StudyWebBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyWebBootApplication.class, args);
	}

}
