package com.devdream.diverjoy.services;

import com.devdream.diverjoy.entities.Game;
import com.devdream.diverjoy.repositories.MenuRepository;

import java.util.ArrayList;

public class GameService {

    private MenuRepository menuRepository;

    public GameService() {
        menuRepository = new MenuRepository();
    }

    public ArrayList<Game> getAllGames() {
        return menuRepository.getAllGames();
    }
}
