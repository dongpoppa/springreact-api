package com.vn.springreact.repository;


import com.vn.springreact.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.Optional;

public interface OrderRepo extends JpaRepository<Order,Integer> {

    Optional<Order> findOrderBySaleDate(Date saleDate);

}
