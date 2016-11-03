package com.devdream.diverjoy.asynctasks;

import android.os.AsyncTask;
import android.util.Log;

import com.devdream.diverjoy.utils.Consts;
import com.devdream.diverjoy.listeners.SplashListener;
import com.devdream.diverjoy.managers.DatabaseManager;

public class DatabaseCheckCreationTask extends AsyncTask<Void, Void, Void> {

    private DatabaseManager manager;
    private SplashListener listener;

    public DatabaseCheckCreationTask(SplashListener splashListener) {
        listener = splashListener;
    }

    @Override
    protected void onPreExecute() {
        manager = new DatabaseManager();
    }

    @Override
    protected void onPostExecute(Void pVoid) {
        listener.goToMenu();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        Log.d(Consts.LogTag.DEBUG, "DatabaseRepository.doInBackground");
        if (!manager.isDatabaseCreated()) {
            Log.d(Consts.LogTag.DEBUG, "DatabaseRepository.doInBackground: seeding database");
            manager.seedDatabase();
        }
        return null;
    }
}
