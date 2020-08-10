package com.vn.springreact.dto;

import com.vn.springreact.entity.Game;
import com.vn.springreact.entity.Order;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class OrderDetailInfo implements Serializable {


    private double price;


    private int quantity;


    private String status;
}
