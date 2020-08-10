package com.vn.springreact.dto;

import com.vn.springreact.entity.OrderDetail;
import com.vn.springreact.entity.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Setter
@Getter
public class OrderDto implements Serializable {


    private int id;


    private Date saleDate;


    private double total;
//
//    @ManyToOne
//    @JoinColumn(name = "order_status")
//    private OrderStatus orderStatus;

    private UserInfo user;

    private Set<OrderDetailInfo> orderDetails;



}
