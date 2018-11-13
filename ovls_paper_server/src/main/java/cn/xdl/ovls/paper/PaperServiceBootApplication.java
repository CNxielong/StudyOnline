package cn.xdl.ovls.paper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient// @EnableEurekaClient包含@EnableDiscoveryClient 此处可以用EnableDiscoveryClient代替
//@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages="cn.xdl.ovls.paper.dao")
@ServletComponentScan //引入组件扫描
public class PaperServiceBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaperServiceBootApplication.class, args);
	}

}

