package com.devdream.diverjoy.managers;

import com.devdream.diverjoy.services.GameService;
import com.devdream.diverjoy.vo.GameVO;

import java.util.ArrayList;

public class MenuManager {

    private GameService gameService;

    public MenuManager() {
        gameService = new GameService();
    }

    public ArrayList<GameVO> getAllGames() {
        return gameService.getAllGames();
    }

}
