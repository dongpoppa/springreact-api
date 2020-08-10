package com.vn.springreact.controller;

import com.vn.springreact.dto.CategoryDto;
import com.vn.springreact.dto.GameDto;
import com.vn.springreact.dto.OrderDto;
import com.vn.springreact.entity.Order;
import com.vn.springreact.service.CategoryService;
import com.vn.springreact.service.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/orders/get-order-by-day", method = RequestMethod.POST)
    List<OrderDto> getOrderByTime(){
        Date from = new Date(2020,06,12);
        Date to = new Date(2020,06,20);
        ModelMapper modelMapper = new ModelMapper();
        List<OrderDto> orderDtos =  new ArrayList<>();
        while(from.getTime() != to.getTime()){
            OrderDto orderDto = modelMapper.map(orderService.findOrderBySaleDate(from),OrderDto.class);
            System.out.println(orderService.findOrderBySaleDate(from));
            System.out.println(orderDto);
            if(orderDto != null){
                orderDtos.add(orderDto);
            }
            from.setDate(from.getDate()+1);
        }
        return orderDtos;
    }

}
