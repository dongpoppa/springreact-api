package com.vn.springreact.dto;

import com.vn.springreact.entity.Game;
import com.vn.springreact.entity.Order;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
public class OrderDetailDto implements Serializable {


    private GameInfo game;


    private OrderInfo order;


    private double price;


    private int quantity;


    private String status;
}
