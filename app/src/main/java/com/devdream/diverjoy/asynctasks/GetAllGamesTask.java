package com.devdream.diverjoy.asynctasks;

import android.os.AsyncTask;

import com.devdream.diverjoy.listeners.MenuListener;
import com.devdream.diverjoy.managers.MenuManager;
import com.devdream.diverjoy.vo.GameVO;

import java.util.ArrayList;

// TODO Make Spinner till this task end
public class GetAllGamesTask extends AsyncTask<Void, Void, Void> {

    private MenuListener listener;
    private MenuManager manager;

    private ArrayList<GameVO> allGames;

    public GetAllGamesTask(MenuListener menuListener) {
        listener = menuListener;
        allGames = new ArrayList<>();
    }

    @Override
    protected void onPreExecute() {
        listener.loadingGameList();
        manager = new MenuManager();
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        listener.gameListLoaded(allGames);
    }

    @Override
    protected Void doInBackground(Void... voids) {
        allGames = manager.getAllGames();
        return null;
    }
}
