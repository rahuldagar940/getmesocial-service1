package com.example.getmesocialservice1.service;

import com.example.getmesocialservice1.model.User;
import com.example.getmesocialservice1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public static User saveUser(User user)
    {
        return UserRepository.saveUser(user);
    }

    public User getUser()
    {
        return userRepository.getUser();

    }

}
