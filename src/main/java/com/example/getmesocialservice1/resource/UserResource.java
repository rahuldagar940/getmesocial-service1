package com.example.getmesocialservice1.resource;


import com.example.getmesocialservice1.model.User;
import com.example.getmesocialservice1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser()
    {
        return userService.getUser();
    }
    @PostMapping("/user")
    public User saveUser(User user)
    {
        return UserService.saveUser(user);
    }
}
