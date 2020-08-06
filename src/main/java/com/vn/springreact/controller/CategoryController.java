package com.vn.springreact.controller;

import com.vn.springreact.dto.CategoryDto;
import com.vn.springreact.dto.GameDto;
import com.vn.springreact.entity.Category;
import com.vn.springreact.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/categories")
    List<CategoryDto> list() {
        ModelMapper modelMapper = new ModelMapper();
        List<CategoryDto> categoryDtos = categoryService.findAll()
                .stream()
                .map(category -> modelMapper.map(category, CategoryDto.class))
                .collect(Collectors.toList());
        return categoryDtos;
    }
}
