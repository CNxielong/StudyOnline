package cn.xdl.ovls.user.util;

import java.util.UUID;
/**
 * 
 * @Title: TokenUtil  
 * @Description: TODO(UUID生成令牌号)  
 * @author X-Dragon  
 * @version V1.0  
 *
 */
public class TokenUtil {

	/**
	 * 生成一个令牌号
	 * @return 令牌号
	 */
	public static String generatorToken(int userId){
		UUID uuid = UUID.randomUUID();
		return uuid.toString()+"-"+userId;
	}
	
}
