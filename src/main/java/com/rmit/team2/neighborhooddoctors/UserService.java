package com.rmit.team2.neighborhooddoctors;

import com.rmit.team2.neighborhooddoctors.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getUser(String email, String password) {
        return userRepository.findByCredentials(email, password);
    }

    public boolean addUser(User user) {
        //return false if user already exists
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            return false;
        }
        userRepository.save(user);
        return true;
    }
}
