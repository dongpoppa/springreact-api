package com.vn.springreact.controller;

import com.vn.springreact.entity.Game;
import com.vn.springreact.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value="/api", produces = "application/json")
public class GameController {

    @Autowired
    GameService gameService;

    @RequestMapping(value = "/games", method = RequestMethod.GET)
    List<Game> list() {
        return gameService.findAll();
    }

    @RequestMapping(value = "/games/{id}", method = RequestMethod.PUT)
    boolean update(@PathVariable int id,@RequestBody Game data) {
        Game game = gameService.findById(id).orElse(null);
        if(game != null){
            game = data;
            gameService.save(game);
            return true;
        }
        return false;
    }
}
