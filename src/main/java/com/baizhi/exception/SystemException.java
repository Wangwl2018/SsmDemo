package com.baizhi.exception;

public class SystemException extends RuntimeException {
	private String message;
	public SystemException(String message){
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
}
