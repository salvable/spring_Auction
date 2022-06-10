package com.example.auction.mapper;

import com.example.auction.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO users(id,password,name,phone_number,email) VALUES(#{user.id},#{user.password},#{user.name},#{user.phone_number},#{user.email})")
    void insert(User user);
}
