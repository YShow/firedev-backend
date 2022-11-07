package com.firedev.backend.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private String resource;

    private String message;


    public ResourceNotFoundException(String resource, String message){
        super(message);
        this.resource = resource;
        this.message = message;
    }





}
