package com.devdream.diverjoy.services;

import com.devdream.diverjoy.repositories.DatabaseRepository;

import io.realm.Realm;
import io.realm.RealmObject;

public class DatabaseService {

    private DatabaseRepository repository;

    public DatabaseService() {
        repository = new DatabaseRepository();
    }

    public boolean isDatabaseCreated() {
        return repository.isDatabaseCreated();
    }

    public static int getNextIdPrimaryKey(Realm realm, Class<? extends RealmObject> realmObject) {
        return realm.where(realmObject).max("id").intValue() + 1;
    }
}
