package com.vn.springreact.repository;

import com.vn.springreact.entity.Game;
import com.vn.springreact.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepo extends JpaRepository<Order,Integer> {

}
