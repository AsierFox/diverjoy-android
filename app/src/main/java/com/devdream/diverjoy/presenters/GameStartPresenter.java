package com.devdream.diverjoy.presenters;

import com.devdream.diverjoy.activities.GameStartActivity;
import com.devdream.diverjoy.listeners.GameStartListener;

public class GameStartPresenter implements GameStartListener {

    private GameStartActivity activity;

    public GameStartPresenter(GameStartActivity gameStartActivity) {
        activity = gameStartActivity;
    }
}
