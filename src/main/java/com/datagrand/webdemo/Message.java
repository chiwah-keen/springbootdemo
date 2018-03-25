package com.datagrand.webdemo;

public class Message{
	
	private Integer status = 0;
	private String message = "Success";
	private String data = "";
	private String requestId = Utils.getCurrentTimeStamp();
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getRequestId() {
		return requestId;
	}
	
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	
	public void setStatusMessage(Integer status, String msg) {
		setStatus(status);
		setMessage(msg);
	}
	
}
