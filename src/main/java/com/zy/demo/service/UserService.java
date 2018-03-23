package com.zy.demo.service;

import com.zy.demo.model.Person;

/**
 * User: YuanZeYao
 * Date: 2018/3/23
 * Time: 16:27
 */
public interface UserService {
    Person selectUser(int id);
}
