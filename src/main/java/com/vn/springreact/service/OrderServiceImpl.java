package com.vn.springreact.service;


import com.vn.springreact.entity.Order;
import com.vn.springreact.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {


    @Override
    public List<Order> findByUser(User user) {
        return null;
    }

    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public Optional<Order> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<Order> save(Order model) {
        return Optional.empty();
    }
}
