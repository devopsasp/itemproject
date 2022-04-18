package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ItemRestExceptionController {

	@ExceptionHandler(DeleteItemException.class)
    public ResponseEntity<?> handleDeleteException(DeleteItemException e,WebRequest req)
    {
	
		
		  return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
		
    }
}
