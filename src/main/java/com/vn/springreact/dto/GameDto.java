package com.vn.springreact.dto;

import com.vn.springreact.entity.Category;
import com.vn.springreact.entity.OrderDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
public class GameDto implements Serializable {

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

    private Set<CategoryInfo> categories;

    private Set<OrderDetailInfo> orderDetails;
}
