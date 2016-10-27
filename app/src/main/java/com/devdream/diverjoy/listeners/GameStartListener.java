package com.devdream.diverjoy.listeners;

import com.devdream.diverjoy.vo.GameVO;

public interface GameStartListener {
    void loadGame(GameVO gameVO);
    void startGame();
}
