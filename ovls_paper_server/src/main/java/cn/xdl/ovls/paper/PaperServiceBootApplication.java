package cn.xdl.ovls.paper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@MapperScan(basePackages="cn.xdl.ovls.paper.dao")
@ServletComponentScan //引入组件扫描
public class PaperServiceBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaperServiceBootApplication.class, args);
	}

}

