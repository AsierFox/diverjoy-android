package com.devdream.diverjoy.listeners;

import android.content.Intent;
import android.view.View;

import com.devdream.diverjoy.activities.GameStartActivity;
import com.devdream.diverjoy.consts.Consts;
import com.devdream.diverjoy.context.AppContext;
import com.devdream.diverjoy.vo.GameVO;

public class ChoseGameOnClickListener implements View.OnClickListener {

    private GameVO game;

    public ChoseGameOnClickListener(GameVO _game) {
        game = _game;
    }

    @Override
    public void onClick(View view) {
        Intent chooseGameIntent = new Intent(AppContext.getContext(), GameStartActivity.class);
        chooseGameIntent.putExtra(Consts.Extras.CHOOSE_GAME_ID, game.getId());
        AppContext.getContext().startActivity(chooseGameIntent);
    }
}
