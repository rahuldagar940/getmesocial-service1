package com.example.getmesocialservice1.repository;

import com.example.getmesocialservice1.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User getUser()
    {
        User user = new User("Rahul", "India", 67);
        return user;
    }
}
