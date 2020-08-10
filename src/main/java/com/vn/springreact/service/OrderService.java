package com.vn.springreact.service;


import com.vn.springreact.entity.Order;
import com.vn.springreact.entity.User;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface OrderService {

    Optional<Order> findOrderBySaleDate(Date saleDate);
}
