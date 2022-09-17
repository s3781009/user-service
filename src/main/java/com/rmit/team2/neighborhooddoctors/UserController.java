package com.rmit.team2.neighborhooddoctors;

import com.rmit.team2.neighborhooddoctors.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String hello() {
        return "";
    }

    @GetMapping("/user")
    public Optional<User> getUser(@RequestBody Map<String, Object> loginInfoMap) {
        return this.userService.getUser(loginInfoMap.get("email").toString(), loginInfoMap.get("password").toString());
    }

    @PostMapping("/user")
    public String postUser(@RequestBody User user) {
        this.userService.addUser(user);
        return "";
    }
}
