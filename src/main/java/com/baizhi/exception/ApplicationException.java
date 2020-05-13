package com.baizhi.exception;

public class ApplicationException extends RuntimeException{
	private String message;
	public ApplicationException (String message){
		super (message);
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
