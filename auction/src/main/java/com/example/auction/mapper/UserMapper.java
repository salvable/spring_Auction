package com.example.auction.mapper;

import com.example.auction.model.User;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO users(id,password,name,phone_number,email) VALUES(#{user.id},#{user.password},#{user.name},#{user.phone_number},#{user.email})")
    int addUser(@Param("user") User user);

    @Select("SELECT * FROM users WHERE id = #{userId}")
    User getUser(@Param("userId") String userId);

    @Update("UPDATE users SET password = #{updateUser.password},name = #{updateUser.name},phone_number = #{updateUser.phone_number},email = #{updateUser.email} where id = #{auctionId}")
    int updateUser(@Param("updateUser") HashMap updateUser, @Param("auctionId") String auctionId);
}
