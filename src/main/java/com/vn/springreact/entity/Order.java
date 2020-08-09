package com.vn.springreact.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "Orders")
public class Order implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @CreatedDate
    @Column(name = "sale_date")
    private Date saleDate;

    @Column(name = "total")
    private double total;
//
//    @ManyToOne
//    @JoinColumn(name = "order_status")
//    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "order")
    private Set<OrderDetail> orderDetails;



}
