package com.devdream.diverjoy.business.managers;

import com.devdream.diverjoy.asynctasks.GetAllGamesTask;
import com.devdream.diverjoy.listeners.MenuListener;
import com.devdream.diverjoy.presenters.MenuPresenter;
import com.devdream.diverjoy.repositories.GamesRepository;
import com.devdream.diverjoy.db.vo.GameVO;

public class GameManager {

    private GamesRepository gamesRepository;
    private MenuListener menuListener;

    public GameManager(MenuListener _menuListener) {
        menuListener = _menuListener;
        gamesRepository = new GamesRepository();
    }

    public void getAllGames() {
        new GetAllGamesTask(menuListener).execute();
    }

    public GameVO getGameInformation(String gameId) {
        return gamesRepository.getGameInformation(gameId);
    }
}
