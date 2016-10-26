package com.devdream.diverjoy.services;

import com.devdream.diverjoy.repositories.GamesRepository;
import com.devdream.diverjoy.vo.GameVO;

import java.util.ArrayList;

public class GamesService {

    private GamesRepository menuRepository;

    public GamesService() {
        menuRepository = new GamesRepository();
    }

    public ArrayList<GameVO> getAllGames() {
        return menuRepository.getAllGames();
    }
}
