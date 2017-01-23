package com.example.controllers;

import com.example.entities.Game;
import com.example.services.GameRepository;
import com.example.viewmodels.GameViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Ben on 1/21/17.
 */

@RestController
public class SampleProjectController {

    @Autowired
    GameRepository games;

    @CrossOrigin
    @RequestMapping(path = "/", method = RequestMethod.POST)
    public GameViewModel homePage(@RequestBody Game newGame) {
        games.save(newGame);

        return new GameViewModel((List)games.findAll());
    }
}
