package com.firedev.backend.service;

import com.firedev.backend.entity.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getUserByName(String name);

    User saveUser(User user);




}
