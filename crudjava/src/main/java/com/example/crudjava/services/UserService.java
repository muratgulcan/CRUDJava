package com.example.crudjava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.crudjava.entities.User;
import com.example.crudjava.repos.UserRepository;

@Service
public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User newUser) {
        return userRepository.save(newUser);
    }

    public User getUser(Long user_id) {
        return userRepository.findById(user_id).orElse(null);
    }

    public User updateUser(@PathVariable Long user_id, @RequestBody User newUser) {
        Optional<User> user = userRepository.findById(user_id);
        if (user.isPresent()) {
            User foundUser = user.get();
            foundUser.setUsername(newUser.getUsername());
            foundUser.setPassword(newUser.getPassword());
            userRepository.save(foundUser);
            return foundUser;
        } else {
            return null;
        }
    }

    public void deleteUser(Long user_id) {
        userRepository.deleteById(user_id);
    }
}
