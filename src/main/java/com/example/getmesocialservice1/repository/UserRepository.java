package com.example.getmesocialservice1.repository;

import com.example.getmesocialservice1.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    static List<User> userList = new ArrayList<>();


    public User getUser()
    {
        User user = new User("Rahul", "India", 67, "MyPC/Address");
        return user;
    }

    public static User saveUser(User user)
    {
        userList.add(user);
        return user;
    }





}
