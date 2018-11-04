package cn.xdl.ovls.user.util;

import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import cn.xdl.ovls.user.entity.Token;

/**
 * 定期清除token列表中过期的令牌
 * @author Administrator
 *
 */
@Component
@EnableScheduling
public class TokenManagerTask {
	
	@Autowired
	private TokenManager tokenManager;
	
	@Scheduled(cron="1/5 * * * * ?")
	public void manager(){
	//	System.out.println("定时清除过期令牌");
		Map<String, Token> tokenMap = tokenManager.tokenMap;
		for(Entry<String, Token> entiy : tokenMap.entrySet()) {  
			String stoken = entiy.getKey();  
		    Token token = entiy.getValue();  
		    Date expired = token.getExpired();  
		    Date now = new Date();  
		    System.out.println("token列表:"+stoken+" 有效期："+expired+" 授权时间:"+token.getLastOperate());
		    //当前时间大于过期时间,说明标识已经过期时间,将token移除  
		    if(now.compareTo(expired) > 0) {  
		     //已过期，清除  
		    	 tokenMap.remove(stoken);  
		    	 System.out.println("清除了:"+stoken+" 清除时间:"+now);
		    }
		} 
	}
	
}
