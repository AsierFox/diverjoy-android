package com.devdream.diverjoy.asynctasks;

import android.os.AsyncTask;
import android.util.Log;

import com.devdream.diverjoy.consts.Consts;
import com.devdream.diverjoy.listeners.SplashListener;
import com.devdream.diverjoy.managers.DatabaseManager;

public class DatabaseCheckCreationTask extends AsyncTask<Void, Void, Void> {

    private DatabaseManager databaseManager;
    private SplashListener splashListener;

    public DatabaseCheckCreationTask(SplashListener newSplashListener) {
        splashListener = newSplashListener;
    }

    @Override
    protected void onPreExecute() {
        databaseManager = new DatabaseManager();
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        Log.d("MEW", "update");
    }

    @Override
    protected void onPostExecute(Void pVoid) {
        splashListener.goToMenu();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        Log.d(Consts.LogTag.DEBUG, "DatabaseRepository.doInBackground");
        if (!databaseManager.isDatabaseCreated()) {
            Log.d(Consts.LogTag.DEBUG, "DatabaseRepository.doInBackground: seeding database");
            databaseManager.seedDatabase();
        }
        return null;
    }
}
