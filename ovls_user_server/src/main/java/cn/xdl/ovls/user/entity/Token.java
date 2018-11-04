package cn.xdl.ovls.user.entity;

import java.util.Date;

public class Token {  
    private int userId;//登录用户名  
    private Date expired; //过期时间  
    private Date lastOperate; // 最近一次操作的时间  
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getExpired() {
		return expired;
	}
	public void setExpired(Date expired) {
		this.expired = expired;
	}
	public Date getLastOperate() {
		return lastOperate;
	}
	public void setLastOperate(Date lastOperate) {
		this.lastOperate = lastOperate;
	}
    
}  
