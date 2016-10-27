package com.devdream.diverjoy.managers;

import com.devdream.diverjoy.services.GamesService;
import com.devdream.diverjoy.db.vo.GameVO;

import java.util.ArrayList;

public class MenuManager {

    private GamesService gameService;

    public MenuManager() {
        gameService = new GamesService();
    }

    public ArrayList<GameVO> getAllGames() {
        return gameService.getAllGames();
    }

}
