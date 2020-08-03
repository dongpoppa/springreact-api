package com.vn.springreact.service;


import com.vn.springreact.entity.Game;
import com.vn.springreact.repository.GameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepo gameRepo;


    @Override
    public Optional<Game> findByName(String name) {
        return null;
    }


    @Override
    public Page<Game> findAll(Pageable pageable) {
        return gameRepo.findAll(pageable);
    }

//    @Override
//    public Page<Game> findGamesByCategory(String cateName, Pageable pageable) {
//        return gameRepo.findGamesByCategory(cateName, pageable);
//    }


    @Override
    public List<Game> findAll() {
        return gameRepo.findAll();
    }


    public List<Game> findAll(String category) {
        return gameRepo.findAll();
    }

    @Override
    public List<Game> findAllDeleted() {
        return gameRepo.findAllDeleted();
    }

    @Override
    public Optional<Game> findById(int id) {
        return gameRepo.findById(id);
    }

    @Override
    public void save(Game model) {
        gameRepo.save(model);
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void update(int id, Game model) {

    }
}
