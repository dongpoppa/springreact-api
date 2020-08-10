package com.vn.springreact.repository;


import com.vn.springreact.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CategoryRepo extends JpaRepository<Category,Integer> {

    Optional<Category> findByName(String name);


}
