package com.devdream.diverjoy.presenters;

import com.devdream.diverjoy.activities.GameStartActivity;
import com.devdream.diverjoy.asynctasks.GetGameInformationTask;
import com.devdream.diverjoy.listeners.GameStartListener;
import com.devdream.diverjoy.vo.GameVO;

public class GameStartPresenter implements GameStartListener {

    private GameStartActivity activity;

    private GetGameInformationTask getGameInformationTask;

    public GameStartPresenter(GameStartActivity gameStartActivity, String gameId) {
        activity = gameStartActivity;
        getGameInformationTask = new GetGameInformationTask(this, gameId);
    }

    public void getGameInformation() {
        getGameInformationTask.execute();
    }

    @Override
    public void loadGame(GameVO gameVO) {
        activity.loadGame(gameVO);
    }

    @Override
    public void startGame() {
        activity.startGame();
    }
}
