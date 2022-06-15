package com.example.auction.mapper;

import com.example.auction.model.Auction;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AuctionMapper {
    @Insert("INSERT INTO auctions(title, description, img, deadline, price, userId) VALUES(#{auction.title},#{auction.description},#{auction.img},#{auction.deadline},#{auction.price},#{userId})")
    int addAuction(@Param("auction") Auction auction,@Param("userId") String userId);
}
