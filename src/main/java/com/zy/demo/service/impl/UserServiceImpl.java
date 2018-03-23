package com.zy.demo.service.impl;

import com.zy.demo.mapper.UserMapper;
import com.zy.demo.model.Person;
import com.zy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: YuanZeYao
 * Date: 2018/3/23
 * Time: 16:28
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public Person selectUser(int id) {
        return userMapper.selectUser(id);
    }
}
