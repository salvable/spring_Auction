package com.example.auction.controller;


import com.example.auction.mapper.UserMapper;
import com.example.auction.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired // 생성자 주입
    private UserMapper userMapper;

    @PostMapping("")
    public int addUser(@RequestBody User user){
        return userMapper.addUser(user);
    }

    @GetMapping("")
    public User getUser(@RequestParam String id){
        return userMapper.getUser(id);
    }

}
