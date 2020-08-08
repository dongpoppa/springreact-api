package com.vn.springreact.controller;

import com.vn.springreact.dto.GameDto;
import com.vn.springreact.entity.Game;
import com.vn.springreact.service.GameService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
public class GameController {

    @Autowired
    GameService gameService;

    @RequestMapping(value = "/games", method = RequestMethod.GET)
    List<GameDto> list() {
        ModelMapper modelMapper = new ModelMapper();
        List<GameDto> gameDtos = gameService.findAllExists()
                .stream()
                .map(game -> modelMapper.map(game,GameDto.class))
                .collect(Collectors.toList());
        return gameDtos;
    }

    @RequestMapping(value = "/games/{id}", method = RequestMethod.GET)
    GameDto getbyId(@PathVariable int id) {
        ModelMapper modelMapper = new ModelMapper();
        GameDto gameDto =  modelMapper.map(gameService.findById(id).get(),GameDto.class);
        return gameDto;
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

    @RequestMapping(value = "/games/{id}", method = RequestMethod.DELETE)
    boolean delete(@PathVariable int id) {
        Game game = gameService.findById(id).orElse(null);
        if(game != null){
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
