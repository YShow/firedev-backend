package com.firedev.backend.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firedev.backend.dto.MyFirstDTORecord;
import com.firedev.backend.entity.User;
import com.firedev.backend.exception.config.ApiError;
import com.firedev.backend.service.UserService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;



    @GetMapping(value = "/meurest",produces = "application/json")
    @Operation(description = "Call my api to get a hello world")
    public ResponseEntity<MyFirstDTORecord> myGetCall(){
	final var dto = new MyFirstDTORecord("Hello world");


	return ResponseEntity.ok(dto);
    }

    @GetMapping(value = "/error")
    @Operation(description = "Test random error message")
    public ResponseEntity<ApiError> randomError(){

	throw new RuntimeException("Eita deu erro");

    }


    @PostMapping
    public ResponseEntity<User> saveUser(@Valid @RequestBody User user){

	User myuser = userService.saveUser(user);

	return ResponseEntity.ok(myuser);
    }

}
