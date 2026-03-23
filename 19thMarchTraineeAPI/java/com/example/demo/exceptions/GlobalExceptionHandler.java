package com.example.demo.exceptions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//this will make the container create obj of this class and give advice to controllers for excepion handling
@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(TraineeNotFoundException.class)
	ResponseEntity<String> handleForIdNotFoundException(TraineeNotFoundException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	ResponseEntity<Map<String,String>> handleForArgumentNotValidException(MethodArgumentNotValidException e){
		
		Map<String,String> maps= new HashMap<>();
		for(FieldError fe: e.getFieldErrors()) {
			maps.put(fe.getField(), fe.getDefaultMessage());
		}
		return new ResponseEntity<>(maps,HttpStatus.BAD_REQUEST);
		
		
	}

}
