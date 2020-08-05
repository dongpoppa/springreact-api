package com.vn.springreact.controller;

import com.vn.springreact.entity.Game;
import com.vn.springreact.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class GameController {

    @Autowired
    GameService gameService;

    @RequestMapping(value = "/games", method = RequestMethod.GET)
    List<Game> list() {
        return gameService.findAllExists();
    }

    @RequestMapping(value = "/games/{id}", method = RequestMethod.PUT)
    boolean update(@PathVariable int id,@RequestBody Game data) {
        Game game = gameService.findById(id).orElse(null);
        if(game != null){
            game = data;
            System.out.println(1);
            gameService.save(game);
            return true;
        }
        return false;
    }

    @RequestMapping(value = "/games/{id}", method = RequestMethod.DELETE)
    boolean delete(@PathVariable int id) {
        Game game = gameService.findById(id).orElse(null);
        if(game != null){
            System.out.println(123);
            game.setStatus(String.valueOf(new Date()));
            gameService.save(game);
            return true;
        }
        return false;
    }


    @RequestMapping(value = "/games", method = RequestMethod.POST)
    boolean create(@RequestBody Game game) {
        if(game != null){
            gameService.save(game);
            return true;
        }
        return false;
    }
}
