package com.devdream.diverjoy.listeners;

import com.devdream.diverjoy.entities.Game;

import java.util.ArrayList;

public interface MenuListener {

    void loadingGameList();
    void gameListLoaded(ArrayList<Game> games);
}
