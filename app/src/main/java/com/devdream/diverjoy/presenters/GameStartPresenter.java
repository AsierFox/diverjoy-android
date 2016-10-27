package com.devdream.diverjoy.presenters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import com.devdream.diverjoy.activities.GameStartActivity;
import com.devdream.diverjoy.activities.inever.INeverPlayActivity;
import com.devdream.diverjoy.activities.mime.MimePlayActivity;
import com.devdream.diverjoy.activities.taboo.TabooPlayActivity;
import com.devdream.diverjoy.asynctasks.GetGameInformationTask;
import com.devdream.diverjoy.utils.Consts;
import com.devdream.diverjoy.context.AppContext;
import com.devdream.diverjoy.listeners.GameStartListener;
import com.devdream.diverjoy.db.vo.GameVO;

public class GameStartPresenter implements GameStartListener {

    private GameStartActivity activity;

    private GetGameInformationTask getGameInformationTask;

    private GameVO selectedGameVO;

    public GameStartPresenter(GameStartActivity gameStartActivity, String gameId) {
        activity = gameStartActivity;
        getGameInformationTask = new GetGameInformationTask(this, gameId);
    }

    public void getGameInformation() {
        getGameInformationTask.execute();
    }

    @Override
    public void loadGame(GameVO gameVO) {
        selectedGameVO = gameVO;
        activity.loadGame(gameVO);
    }

    @Override
    public void startGame() {
        Intent startGameIntent = new Intent(AppContext.getContext(), getSelectedGameActivity());
        activity.startActivity(startGameIntent);
    }

    private Class<? extends AppCompatActivity> getSelectedGameActivity() {
        switch (selectedGameVO.getId()) {
            case Consts.Games.I_NEVER_ID:
                return INeverPlayActivity.class;
            case Consts.Games.MIME_ID:
                return MimePlayActivity.class;
            case Consts.Games.TABOO_ID:
                return TabooPlayActivity.class;
        }
        return null;
    }
}
