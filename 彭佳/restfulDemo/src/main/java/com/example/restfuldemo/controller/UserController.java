package com.example.restfuldemo.controller;

import com.example.restfuldemo.model.User;
import com.example.restfuldemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        List<User> userList = userService.list();
        return userList;
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        User user = userService.getById(id);
        return  user;
    }
    @PostMapping("/user")
    public String addUser(@RequestBody User user){
        if(userService.save(user)){
            return "添加用户成功";
        }
        else  return "添加用户失败";
    }
    @PutMapping("/user")
    public String updataUser(@RequestBody User user){
        if (userService.updateById(user)){
            return "修改用户成功";
        }
        else  return "修改用户失败";

    }
    public String deleteUser(Integer id){
        if(userService.removeById(id)){
            return "删除用户成功";
        }
        else return "删除用户失败";
    }
}

