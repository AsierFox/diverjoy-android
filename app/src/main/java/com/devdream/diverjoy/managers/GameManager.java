package com.devdream.diverjoy.managers;

import com.devdream.diverjoy.repositories.GamesRepository;
import com.devdream.diverjoy.vo.GameVO;

public class GameManager {

    public GamesRepository gamesRepository;

    public GameManager() {
        gamesRepository = new GamesRepository();
    }

    public GameVO getGameInformation(String gameId) {
        return gamesRepository.getGameInformation(gameId);
    }
}
