package com.dev.openAPI.ResumeBuilder.exception;

import org.springframework.http.HttpStatus;

public class Error {

	private String message;
	private HttpStatus status;
	
	Error(){
		
	}
	
	public Error(String message, HttpStatus status){
		this();
		this.message = message;
		this.status = status;
		
	}

	public String getMessage() {
		return message;
	}

	public HttpStatus getStatus() {
		return status;
	}
	
}
