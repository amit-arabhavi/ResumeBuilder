package com.dev.openAPI.ResumeBuilder.exception;

import java.io.FileNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ResumeBuilderExceptionHandler {

	@ExceptionHandler(value = FileNotFoundException.class)
	public ResponseEntity<Object> exception(FileNotFoundException e){
		Error error = new Error(e.getMessage(), HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(error,HttpStatus.NO_CONTENT);
	}
}
