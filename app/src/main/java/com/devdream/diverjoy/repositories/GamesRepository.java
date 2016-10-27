package com.devdream.diverjoy.repositories;

import com.devdream.diverjoy.db.RealmHelper;
import com.devdream.diverjoy.entities.Game;
import com.devdream.diverjoy.vo.GameVO;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class GamesRepository {

    public ArrayList<GameVO> getAllGames() {
        ArrayList<GameVO> res = new ArrayList<>();
        Realm realm = Realm.getInstance(RealmHelper.getRealmConfiguration());
        RealmResults<Game> allGames = realm.where(Game.class).findAll();
        for (Game game : allGames) {
            GameVO gameVO = new GameVO();
            gameVO.setId(game.getId());
            gameVO.setName(game.getName());
            gameVO.setDescription(game.getDescription());
            gameVO.setCardColor(game.getCardColor());
            res.add(gameVO);
        }
        realm.close();
        return res;
    }

    public GameVO getGameInformation(String gameId) {
        ArrayList<GameVO> res = new ArrayList<>();
        Realm realm = Realm.getInstance(RealmHelper.getRealmConfiguration());
        Game game = realm.where(Game.class).equalTo("id", gameId).findFirst();
        GameVO gameVO = new GameVO();
        gameVO.setId(game.getId());
        gameVO.setName(game.getName());
        gameVO.setDescription(game.getDescription());
        gameVO.setCardColor(game.getCardColor());
        realm.close();
        return gameVO;
    }
}
