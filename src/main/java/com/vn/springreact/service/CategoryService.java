package com.vn.springreact.service;



import com.vn.springreact.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    Optional<Category> findByName(String name);

    List<Category> findAll();



    Optional<Category> findById(int id);

    void save(Category model);

    void remove(Category model);

    void update(int id, Category model);
}
