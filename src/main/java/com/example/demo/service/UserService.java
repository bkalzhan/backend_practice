package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public List<User> getUsers(){
        User user1 = new User(1, "bkalzhan", "bekzat@gmail.com", "123456");
        User user2 = new User(2, "bkalzhan", "bekzat@gmail.com", "123456");
        User user3 = new User(3, "bkalzhan", "bekzat@gmail.com", "123456");
        User user4 = new User(4, "bkalzhan", "bekzat@gmail.com", "123456");
        User user5 = new User(5, "bkalzhan", "bekzat@gmail.com", "123456");

        List<User> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        return users;
    }
}
