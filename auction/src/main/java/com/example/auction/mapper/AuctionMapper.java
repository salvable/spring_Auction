package com.example.auction.mapper;

import com.example.auction.model.Auction;

import com.example.auction.model.User;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface AuctionMapper {
    @Insert("INSERT INTO auctions(title, description, img, deadline, price, userId) VALUES(#{auction.title},#{auction.description},#{auction.img},#{auction.deadline},#{auction.price},#{userId})")
    int addAuction(@Param("auction") Auction auction,@Param("userId") String userId);

    @Update("UPDATE auctions SET title = #{updateAuction.title},description = #{updateAuction.description},img = #{updateAuction.img},deadline = #{updateAuction.deadline} ,price = #{updateAuction.price} where id = #{auctionId}")
    int updateAuction(@Param("updateAuction") HashMap auction, @Param("auctionId") String auctionId);

    @Select("SELECT * FROM auctions WHERE id = #{auctionId}")
    Auction getAuction(@Param("auctionId") String auctionId);

    @Select("SELECT * FROM auctions WHERE userid = #{userId}")
    List<Auction> getAuctions(@Param("userId") String userId);

}
