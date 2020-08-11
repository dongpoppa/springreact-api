package com.vn.springreact.controller;

import com.vn.springreact.dto.CategoryDto;
import com.vn.springreact.dto.GameDto;
import com.vn.springreact.entity.Category;
import com.vn.springreact.entity.Game;
import com.vn.springreact.service.CategoryService;
import com.vn.springreact.service.GameService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    GameService gameService;

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    List<CategoryDto> list() {
        ModelMapper modelMapper = new ModelMapper();
        List<CategoryDto> categoryDtos = categoryService.findAll()
                .stream()
                .map(category -> modelMapper.map(category, CategoryDto.class))
                .collect(Collectors.toList());
        return categoryDtos;
    }

    @RequestMapping(value = "/categories", method = RequestMethod.POST)
    boolean saveOrUpdate(@RequestBody Category category) {
        System.out.println(category);
        int id = category.getId();
        if (category != null) {
            categoryService.save(category);
            if (id == 0) {
                category.getGames()
                        .stream()
                        .forEach(game -> {
                            Set<Category> categories = game.getCategories();
                            categories.add(category);
                            game.setCategories(categories);
                            gameService.save(game);
                        });
            }
            return true;
        }
        return false;
    }

    @RequestMapping(value = "/categories/{id}", method = RequestMethod.DELETE)
    boolean delete(@PathVariable int id) {
        Category category = categoryService.findById(id).orElse(null);
        if (category != null) {
            try {
                gameService.findGamesByCategory(id)
                        .stream()
                        .forEach(game -> {
                            Set<Category> categorySet = game.getCategories();
                            categorySet.remove(category);
                            game.setCategories(categorySet);
                            gameService.save(game);
                            System.out.println(game);
                        });
                categoryService.remove(category);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }
}
