package com.zy.demo.controller;

import com.zy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: YuanZeYao
 * Date: 2018/3/23
 * Time: 16:29
 */
@RestController
@EnableAutoConfiguration
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/showUser/{id}")
    public String selectUser(@PathVariable int id){
        return userService.selectUser(id).toString();
    }
}
