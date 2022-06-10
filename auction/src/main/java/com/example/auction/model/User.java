package com.example.auction.model;

import lombok.Data;

@Data
public class User {
    private String id;
    private String password;
    private String name;
    private String phone_number;
    private String email;
}