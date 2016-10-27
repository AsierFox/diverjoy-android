package com.devdream.diverjoy.presenters;

import android.content.Intent;

import com.devdream.diverjoy.activities.GameStartActivity;
import com.devdream.diverjoy.activities.MenuActivity;
import com.devdream.diverjoy.asynctasks.GetAllGamesTask;
import com.devdream.diverjoy.utils.Consts;
import com.devdream.diverjoy.context.AppContext;
import com.devdream.diverjoy.listeners.MenuListener;
import com.devdream.diverjoy.db.vo.GameVO;

import java.util.ArrayList;

public class MenuPresenter implements MenuListener {

    private MenuActivity activity;

    private GetAllGamesTask getAllGamesTask;

    public MenuPresenter(MenuActivity newActivity) {
        activity = newActivity;

        getAllGamesTask = new GetAllGamesTask(this);
    }

    public void getAllGames() {
        getAllGamesTask.execute();
    }

    @Override
    public void loadingGameList() {
        activity.loadingGameList();
    }

    @Override
    public void gameListLoaded(ArrayList<GameVO> games) {
        activity.gameListLoaded(games);
    }

    @Override
    public void choseGameOnClick(GameVO gameVO) {
        Intent chooseGameIntent = new Intent(AppContext.getContext(), GameStartActivity.class);
        chooseGameIntent.putExtra(Consts.Extras.CHOOSE_GAME_ID, gameVO.getId());
        AppContext.getContext().startActivity(chooseGameIntent);
    }
}
