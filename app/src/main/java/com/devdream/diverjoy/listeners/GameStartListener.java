package com.devdream.diverjoy.listeners;

import com.devdream.diverjoy.db.vo.GameVO;

public interface GameStartListener {
    void loadGame(GameVO gameVO);
    void startGame();
}
