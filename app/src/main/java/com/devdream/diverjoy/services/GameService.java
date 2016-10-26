package com.devdream.diverjoy.services;

import com.devdream.diverjoy.repositories.GameRepository;
import com.devdream.diverjoy.vo.GameVO;

import java.util.ArrayList;

public class GameService {

    private GameRepository menuRepository;

    public GameService() {
        menuRepository = new GameRepository();
    }

    public ArrayList<GameVO> getAllGames() {
        return menuRepository.getAllGames();
    }
}
