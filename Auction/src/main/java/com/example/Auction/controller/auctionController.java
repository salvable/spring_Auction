package com.example.Auction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auction")
public class auctionController {
    @GetMapping("")
    public String test() {
        return "user";
    }
}
