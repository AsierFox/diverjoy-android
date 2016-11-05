package com.devdream.diverjoy.business.managers;

import com.devdream.diverjoy.repositories.GamesRepository;
import com.devdream.diverjoy.db.vo.GameVO;

public class GameManager {

    public GamesRepository gamesRepository;

    public GameManager() {
        gamesRepository = new GamesRepository();
    }

    public GameVO getGameInformation(String gameId) {
        return gamesRepository.getGameInformation(gameId);
    }
}