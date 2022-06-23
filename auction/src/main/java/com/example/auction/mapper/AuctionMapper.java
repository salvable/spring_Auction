package com.example.auction.mapper;

import com.example.auction.model.Auction;

import com.example.auction.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.HashMap;

@Mapper
public interface AuctionMapper {
    @Insert("INSERT INTO auctions(title, description, img, deadline, price, userId) VALUES(#{auction.title},#{auction.description},#{auction.img},#{auction.deadline},#{auction.price},#{userId})")
    int addAuction(@Param("auction") Auction auction,@Param("userId") String userId);

    @Update("UPDATE auctions SET title = #{updateAuction.title},description = #{updateAuction.description},img = #{updateAuction.img},deadline = #{updateAuction.deadline} ,price = #{updateAuction.price} where id = #{auctionId}")
    int updateAuction(@Param("updateAuction") HashMap auction, @Param("auctionId") String auctionId);
}
