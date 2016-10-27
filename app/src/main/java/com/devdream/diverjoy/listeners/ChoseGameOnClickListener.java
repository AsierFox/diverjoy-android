package com.devdream.diverjoy.listeners;

import android.view.View;

import com.devdream.diverjoy.db.vo.GameVO;

public class ChoseGameOnClickListener implements View.OnClickListener {

    private MenuListener listener;
    private GameVO game;

    public ChoseGameOnClickListener(MenuListener menuListener, GameVO _game) {
        listener = menuListener;
        game = _game;
    }

    @Override
    public void onClick(View view) {
        listener.choseGameOnClick(game);
    }
}
