package com.java.site.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.site.entity.User;
import com.java.site.repository.UserRepository;

@Service
@Transactional(readOnly=true)
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    public List<User> getUserList() {
        return userRepository.findAll();
    }
}
