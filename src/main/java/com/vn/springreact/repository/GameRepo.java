package com.vn.springreact.repository;

import com.vn.springreact.entity.Category;
import com.vn.springreact.entity.Game;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface GameRepo extends JpaRepository<Game,Integer> {

    @Query("SELECT g FROM Game g WHERE g.status is not null")
    List<Game> findAllDeleted();

    @Query("SELECT g FROM Game g WHERE g.status is null")
    List<Game> findAllExists();
//    @Query("SELECT g FROM Game g JOIN g.categories c WHERE c.name= :cateName")
@Query("SELECT g FROM Game g JOIN g.categories c WHERE c.id= :cateId and g.status is null")
    List<Game> findGamesExistsByCategory(int cateId);

    @Query("SELECT g FROM Game g JOIN g.categories c WHERE c.id= :cateId")
    List<Game> findGamesByCategory(int cateId);
}
