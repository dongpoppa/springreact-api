package com.vn.springreact.service;


import com.vn.springreact.entity.Order;
import com.vn.springreact.entity.User;

import java.util.List;
import java.util.Optional;


public interface OrderService {

    List<Order> findByUser(User user);

    List<Order> findAll();

    Optional<Order> findById(int id);

    Optional<Order> save(Order model);

}
