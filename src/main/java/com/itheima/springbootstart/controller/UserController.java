package com.itheima.springbootstart.controller;

import com.itheima.springbootstart.pojo.User;
import com.itheima.springbootstart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //Autowired注解用于自动装配，将UserService对象注入到UserController中
    @Autowired
    private UserService userService;
    //RequestMapping注解用于映射URL到相应的处理方法
    @RequestMapping("/findById")
    public User findById(Integer id) {
        //调用userService的findById方法，根据id查找用户
        return userService.findById(id);
    }
}