package com.zy.demo.mapper;

import com.zy.demo.model.Person;
import org.apache.ibatis.annotations.Select;

/**
 * User: YuanZeYao
 * Date: 2018/3/23
 * Time: 16:26
 */
public interface UserMapper {
    @Select("SELECT * FROM Person WHERE id = #{id}")
    Person selectUser(int id);
}
