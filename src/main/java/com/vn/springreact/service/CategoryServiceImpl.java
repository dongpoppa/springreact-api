package com.vn.springreact.service;


import com.vn.springreact.entity.Category;
import com.vn.springreact.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;


    @Override
    public Optional<Category> findByName(String name) {
        return categoryRepo.findByName(name);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    @Override
    public Optional<Category> findById(int id) {
        return categoryRepo.findById(id);
    }

    @Override
    public void save(Category model) {
        categoryRepo.save(model);
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void update(int id, Category model) {

    }
}
