package com.example.auction.controller;
import com.example.auction.mapper.AuctionMapper;
import com.example.auction.model.Auction;
import com.example.auction.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/auction")
public class AuctionController {

    @Autowired // 생성자 주입
    private AuctionMapper auctionMapper;

    @PostMapping("")
    public int addAuction(@RequestBody Auction auction, @RequestParam String userId){
        return auctionMapper.addAuction(auction, userId);
    }

    @PutMapping("/{auctionId}")
    public int updateAuction(@PathVariable String auctionId, @RequestBody HashMap auction, @RequestParam String userId) {
        return auctionMapper.updateAuction(auction, auctionId);
    }

    @GetMapping("")
    public Auction getAuction(@RequestParam String auctionId) {
        return auctionMapper.getAuction(auctionId);
    }

    @GetMapping("/{userId}")
    public List<Auction> getAuctions(@PathVariable String userId) {
        return auctionMapper.getAuctions(userId);
    }
}
