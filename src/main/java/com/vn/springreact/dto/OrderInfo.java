package com.vn.springreact.dto;

import com.vn.springreact.entity.OrderDetail;
import com.vn.springreact.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Setter
@Getter
public class OrderInfo implements Serializable {


    private int id;


    private Date saleDate;


    private double total;


}
