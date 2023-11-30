package com.itheima.springbootstart.mapper;

import com.itheima.springbootstart.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    // 根据id查询用户
    @Select("select * from user where id = #{id}")
    public User findById(Integer id);
}