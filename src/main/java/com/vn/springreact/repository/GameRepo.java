package com.vn.springreact.repository;

import com.vn.springreact.entity.Game;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepo extends JpaRepository<Game,Integer> {

    @Query("SELECT g FROM Game g WHERE g.status is not null")
    List<Game> findAllDeleted();

//    @Query("SELECT g FROM Game g JOIN g.categories c WHERE c.name= :cateName")
//    Page<Game> findGamesByCategory(String cateName, Pageable pageable);
}
