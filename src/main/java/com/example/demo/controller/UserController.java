package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable int userId) {
        return userService.getUser(userId);
    }

    @PostMapping("/users")
    public User save(@RequestBody UserDto userDto) {
        return userService.save(userDto.id, userDto.nickname, userDto.email, userDto.password);
    }

    @PutMapping("/users/{userId}")
    public User update(@PathVariable int userId, @RequestBody UserDto userDto){
        return userService.update(userId, userDto);
    }

    @DeleteMapping("/users/{userId}")
    public boolean update(@PathVariable int userId){
        return userService.delete(userId);
    }

}
