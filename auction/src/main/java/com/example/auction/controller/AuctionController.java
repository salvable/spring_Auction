package com.example.auction.controller;
import com.example.auction.mapper.AuctionMapper;
import com.example.auction.model.Auction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auction")
public class AuctionController {

    @Autowired // 생성자 주입
    private AuctionMapper auctionMapper;

    @PostMapping("")
    public int addAuction(@RequestBody Auction auction, @RequestParam String userId){
        return auctionMapper.addAuction(auction, userId);
    }
}
