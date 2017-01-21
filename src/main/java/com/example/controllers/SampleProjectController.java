package com.example.controllers;

import com.example.entities.Game;
import com.example.services.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ben on 1/21/17.
 */

@Controller
public class SampleProjectController {

    @Autowired
    GameRepository games;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String homePage(Model model) {
        model.addAttribute("games", games.findAll());
        return "home";
    }

    @RequestMapping(path = "/add-game", method = RequestMethod.POST)
    public String postGame(Game game) {

        games.save(game);
        return "redirect:/";
    }
}
