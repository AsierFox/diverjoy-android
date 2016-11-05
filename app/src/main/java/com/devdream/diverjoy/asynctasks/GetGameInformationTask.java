package com.devdream.diverjoy.asynctasks;

import android.os.AsyncTask;

import com.devdream.diverjoy.listeners.GameStartListener;
import com.devdream.diverjoy.business.managers.GameManager;
import com.devdream.diverjoy.db.vo.GameVO;

public class GetGameInformationTask extends AsyncTask<Void, Void, Void> {

    private GameStartListener listener;
    private GameManager manager;

    private String gameId;
    private GameVO gameVO;

    public GetGameInformationTask(GameStartListener gameStartListener, String _gameId) {
        listener = gameStartListener;
        gameId = _gameId;
    }

    @Override
    protected void onPreExecute() {
        manager = new GameManager();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        gameVO = manager.getGameInformation(gameId);
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        listener.loadGame(gameVO);
    }
}
