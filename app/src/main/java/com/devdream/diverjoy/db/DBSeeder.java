package com.devdream.diverjoy.db;

import com.devdream.diverjoy.entities.Game;

import io.realm.Realm;

public class DBSeeder {

    private Realm realm;

    public DBSeeder() {
        realm = Realm.getDefaultInstance();
    }

    public void seed() {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                seedGames();
            }
        });
    }

    private void seedGames() {
        Game game1 = realm.createObject(Game.class);
        game1.setName("Tabu");
        game1.setDescription("");
    }
}
