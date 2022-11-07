package com.firedev.backend.exception.config;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.firedev.backend.exception.ResourceNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);



    @ExceptionHandler({ Exception.class })
    public ResponseEntity<ApiError> handleAll(Exception ex, WebRequest request)
    {
	final var error = ApiError.builder().message(ex.getMessage()).timestamp(LocalDateTime.now()).build();

	if(log.isErrorEnabled()) {
	    log.error(error.toString());
	}

	return new ResponseEntity<>(error,new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler({ ResourceNotFoundException.class })
    public ResponseEntity<ApiError> handleResourceNotFound(ResourceNotFoundException ex, WebRequest request){

	final var error = ApiError.builder().message(ex.getMessage()).timestamp(LocalDateTime.now()).build();

	return new ResponseEntity<>(error,new HttpHeaders(), HttpStatus.NOT_FOUND);
    }




}
