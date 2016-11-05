package com.devdream.diverjoy.business.services;

import com.devdream.diverjoy.repositories.GamesRepository;
import com.devdream.diverjoy.db.vo.GameVO;

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
