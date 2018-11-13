package cn.xdl.ovls.paper.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @Title: RestTemplateConfig  
 * @Description: TODO(ribbon负载模式下的RestTemplate)  
 * @author X-Dragon  
 * @version V1.0  
 *
 */
@Configuration
public class RestTemplateConfig {
	
	@Bean
	@LoadBalanced//启用ribbon负载均衡调用策略
	public RestTemplate createRestTemplate(){
		return new RestTemplate();
	}
}
