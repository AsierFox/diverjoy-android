package com.devdream.diverjoy.listeners;

import com.devdream.diverjoy.vo.GameVO;

import java.util.ArrayList;

public interface MenuListener {

    void loadingGameList();
    void gameListLoaded(ArrayList<GameVO> games);
    void choseGameOnClick(GameVO gameVO);
}
