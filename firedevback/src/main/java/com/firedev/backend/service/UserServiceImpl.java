package com.firedev.backend.service;

import com.firedev.backend.entity.User;
import com.firedev.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;



    @Override
    public Optional<User> getUserByName(String name) {
        return Optional.empty();
    }

    @Transactional
    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }
}
