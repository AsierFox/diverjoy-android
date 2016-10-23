package com.devdream.diverjoy.repositories;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

import com.devdream.diverjoy.consts.Consts;

public class DatabaseRepository {

    public SQLiteDatabase getDatabase() {
        SQLiteDatabase db;
        try {
            db = SQLiteDatabase.openDatabase(
                    Consts.Database.NAME, null,
                    SQLiteDatabase.OPEN_READONLY);
            db.close();
        } catch (SQLiteException e) {
            return null;
        }
        return db;
    }
}
