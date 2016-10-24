package com.devdream.diverjoy.db;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.devdream.diverjoy.consts.Consts;
import com.devdream.diverjoy.context.AppContext;

import io.realm.Realm;
import io.realm.RealmObject;

public class DBHelper extends SQLiteOpenHelper {

    private boolean created;

    public DBHelper() {
        super(AppContext.getContext(),Consts.Database.NAME, null, Consts.Database.SCHEMA_VERSION);
        created = false;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        created = true;
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }

    public boolean isCreated() {
        return created;
    }

    public static int getNextIdPrimaryKey(Realm realm, Class<? extends RealmObject> realmObject) {
        return realm.where(realmObject).max("id").intValue() + 1;
    }
}
