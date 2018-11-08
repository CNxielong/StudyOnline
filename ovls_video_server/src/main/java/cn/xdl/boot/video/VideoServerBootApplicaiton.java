package cn.xdl.boot.video;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan(basePackages="cn.xdl.boot.video.dao")
public class VideoServerBootApplicaiton {
		
	public static void main(String[] args) {
		SpringApplication.run(VideoServerBootApplicaiton.class, args);
	}
	
}
