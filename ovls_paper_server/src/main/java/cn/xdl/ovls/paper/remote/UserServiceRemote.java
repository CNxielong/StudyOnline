package cn.xdl.ovls.paper.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.xdl.ovls.paper.util.ResponseResult;

/**
 * 
 * @Title: UserServiceRemote  
 * @Description: TODO(FeignClient对应哪个服务实例)  
 * @author X-Dragon  
 * @version V1.0  
 *
 */
@FeignClient(name="USERSERVER")//对应微服务的 服务端名称
public interface UserServiceRemote {
	//调用 http://USERSERVER/user/token?token= 
	//有参数需要用value
	//method设置请求方式，不设置默认是GET
	@RequestMapping(value="/user/token",method=RequestMethod.GET)
	ResponseResult checkToken(String token);
		
}
