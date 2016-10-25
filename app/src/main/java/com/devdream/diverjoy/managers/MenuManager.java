package com.devdream.diverjoy.managers;

import com.devdream.diverjoy.entities.Game;
import com.devdream.diverjoy.services.GameService;

import java.util.ArrayList;

public class MenuManager {

    private GameService gameService;

    public MenuManager() {
        gameService = new GameService();
    }

    public ArrayList<Game> getAllGames() {
        return gameService.getAllGames();
    }

}
