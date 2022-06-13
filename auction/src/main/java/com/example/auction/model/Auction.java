package com.example.auction.model;

import lombok.Data;
import java.sql.Date;

@Data
public class Auction {
    private int id;
    private String title;
    private String description;
    //S3 에 저장될 주소여야 함, 본 프로젝트에서는 로컬에 저장
    private String img;
    private Date deadline;
    private int price;
    private String userId;
}