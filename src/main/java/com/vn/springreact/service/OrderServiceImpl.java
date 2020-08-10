package com.vn.springreact.service;


import com.vn.springreact.entity.Order;
import com.vn.springreact.entity.User;
import com.vn.springreact.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Override
    public Optional<Order> findOrderBySaleDate(Date saleDate){
        return orderRepo.findOrderBySaleDate(saleDate);
    }
}
