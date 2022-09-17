package com.rmit.team2.neighborhooddoctors;

import com.rmit.team2.neighborhooddoctors.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public Optional<User> getUser(@RequestBody Map<String, Object> loginInfoMap) {
        return this.userService.getUser(loginInfoMap.get("email").toString(), loginInfoMap.get("password").toString());
    }

    @PostMapping("/user")
    public ResponseEntity<String> postUser(@RequestBody User user) {
         if (this.userService.addUser(user)){
             return ResponseEntity.status(HttpStatus.CREATED).body(null);
         }

        return ResponseEntity.status(HttpStatus.CONFLICT).body(null);
    }
}
