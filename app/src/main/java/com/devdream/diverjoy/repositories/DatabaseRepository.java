package com.devdream.diverjoy.repositories;

import android.util.Log;

import com.devdream.diverjoy.consts.Consts;
import com.devdream.diverjoy.db.DBHelper;

public class DatabaseRepository {

    public boolean isDatabaseCreated() {
        Log.d(Consts.LogTag.DEBUG, "DatabaseRepository.isDatabaseCreated");
        DBHelper dbHelper = new DBHelper();
        dbHelper.getWritableDatabase();
        return dbHelper.isCreated();
    }
}
