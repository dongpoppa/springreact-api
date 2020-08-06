package com.vn.springreact.dto;

import com.vn.springreact.entity.Category;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class GameInfo {

    private int id;

    private String name;
    private int minPlayer;

    private int maxPlayer;

    private int bestPlayerQuantity;

    private int timeToPlayFrom;

    private int timeToPlayTo;

    private int ageLimited;

    private String publisher;

    private String rules;

    private int quantity;

    private double price;

    private String image;

    private String status;

}
