package com.devdream.diverjoy.db;

import com.devdream.diverjoy.utils.Consts;

import io.realm.RealmConfiguration;

public final class RealmHelper {

    public static RealmConfiguration getRealmConfiguration() {
        return new RealmConfiguration
                .Builder()
                .schemaVersion(Consts.Database.SCHEMA_VERSION)
                .deleteRealmIfMigrationNeeded()
                .build();
    }
}
