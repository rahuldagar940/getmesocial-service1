package com.example.getmesocialservice1.resource;


import com.example.getmesocialservice1.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {
    @GetMapping("/user")
    public User getUser()
    {
        User user = new User("Rahul", "India", 67);
        return user;
    }
}
