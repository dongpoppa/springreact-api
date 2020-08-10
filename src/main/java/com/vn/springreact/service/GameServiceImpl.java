package com.vn.springreact.service;


import com.vn.springreact.entity.Category;
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
    public List<Game> findAllDeleted() {
        return gameRepo.findAllDeleted();
    }

    @Override
    public List<Game> findAllExists() {
        return gameRepo.findAllExists();
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
    public List<Game> findGamesByCategory(int id){
      return  gameRepo.findGamesByCategory(id);
    }
    @Override
    public void update(int id, Game model) {

    }
}
