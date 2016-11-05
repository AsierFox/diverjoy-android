package com.devdream.diverjoy.business.managers;

import com.devdream.diverjoy.business.services.GamesService;
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
