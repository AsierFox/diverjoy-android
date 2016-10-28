package com.devdream.diverjoy.presenters;

import com.devdream.diverjoy.activities.MenuActivity;
import com.devdream.diverjoy.asynctasks.GetAllGamesTask;
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
        activity.choseGameOnClick(gameVO);
    }
}
