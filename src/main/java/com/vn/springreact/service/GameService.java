package com.vn.springreact.service;



import com.vn.springreact.entity.Category;
import com.vn.springreact.entity.Game;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface GameService {

    Optional<Game> findByName(String name);

    List<Game> findAllExists();

    List<Game> findAllDeleted();

    List<Game> findGamesByCategory(int id);

    Optional<Game>  findById(int id);

    void save(Game model);

    void remove(int id);

    void update(int id, Game model);
}
