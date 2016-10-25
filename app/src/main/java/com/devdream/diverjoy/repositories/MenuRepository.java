package com.devdream.diverjoy.repositories;

import com.devdream.diverjoy.db.RealmHelper;
import com.devdream.diverjoy.entities.Game;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class MenuRepository {

    public ArrayList<Game> getAllGames() {
        ArrayList<Game> res = new ArrayList<>();
        Realm realm = Realm.getInstance(RealmHelper.getRealmConfiguration());
        RealmResults<Game> allGames = realm.where(Game.class).findAll();
        for (Game game : allGames) {
            res.add(game);
        }
        realm.close();
        return res;
    }
}
