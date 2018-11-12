package cn.xdl.ovls.user.util;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

import cn.xdl.ovls.user.entity.Token;

@Component
public class TokenManager {  
  
    //令牌存储结构 ConcurrentHashMap
    public Map<String, Token> tokenMap = 
    		new ConcurrentHashMap<String, Token>();  
  
    /**
     * 令牌有效性验证 
     * @param stoken 用户令牌
     * @return true有效;false失效
     */
    public boolean validate(String stoken) {  
        System.out.println("Token验证");  
        if(tokenMap.containsKey(stoken)){ //令牌存在 
        	Token token =  tokenMap.get(stoken);
            Date expired = token.getExpired();
            Date now = new Date();  
            if(now.compareTo(expired) > 0){//已过期    
                tokenMap.remove(stoken);//移除  
            }else{//未过期
            	return true;
            }
         }
        return false;  
    }  
  
   /**
    * 用户授权成功后存入授权信息 
    * @param stoken 用户令牌
    * @param userId 用户ID
    */
    public void addToken(String stoken, int userId) {  
        Token token = new Token();  
        token.setUserId(userId); 
        token.setLastOperate(new Date());  
        token.setExpired(new Date(token.getLastOperate().getTime() + 2 * 60 * 1000));  
  
        tokenMap.put(stoken, token);  
    }  
  
   /**
    * 更新token最近一次操作的时间和有效期期 
    * @param stoken 用户令牌
    */
    public void updateLastOperate(String stoken) {  
        Token token = tokenMap.get(stoken);  
        token.setLastOperate(new Date());  
        token.setExpired(new Date(token.getLastOperate().getTime() + 2 * 60 * 1000));  
    }  
 
}  