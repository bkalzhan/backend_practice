package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(int id){
        return userRepository.findById(id).get();
    }

    public User save(int id, String nickname, String email, String password){
        User user = new User(id, nickname, email, password);
        return userRepository.save(user);
    }

    public User update(int id, UserDto userDto) {
        User user = userRepository.findById(id).get();

        if(userDto.nickname != null) {
            user.setNickname(userDto.nickname);
        }

        if(userDto.password != null) {
            user.setPassword(userDto.password);
        }

        if(userDto.email != null) {
            user.setEmail(userDto.email);
        }

        return userRepository.save(user);
    }

    public boolean delete(int id){
        userRepository.deleteById(id);
        return !userRepository.existsById(id);
    }
}
