package cn.xdl.boot.video.entity;

import java.io.Serializable;
/**
 * 
 * @Title: ResponseResult  
 * @Description: TODO(封装相应结果)  
 * @author X-Dragon  
 * @version V1.0  
 */
public class ResponseResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 保存状态  1:成功  2:用户不存在  3:密码不正确
	 * */
	private int status;
	/**
	 * 返回值信息
	 * */
	private String msg;	
	/**
	 * 数据
	 * */
	private Object data;
	
	public ResponseResult() {
		super();
	}
	public ResponseResult(int status, String msg, Object data) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
	}
	/**
	 * 保存状态  1:成功  2:用户不存在  3:密码不正确
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * 设置处理状态
	 * @param status 保存状态  1:成功  2:用户不存在  3:密码不正确
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * 返回处理状态
	 * @return 状态值 1表示成功;2\3\4
	 */
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResponseResult [status=" + status + ", msg=" + msg + ", data=" + data + "]";
	}	
	
	
}
