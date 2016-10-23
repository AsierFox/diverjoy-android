package com.devdream.diverjoy.presenters;

import com.devdream.diverjoy.activities.SplashActivity;
import com.devdream.diverjoy.listeners.SplashListener;
import com.devdream.diverjoy.managers.DatabaseManager;

public class SplashPresenter implements SplashListener {

    private SplashActivity activity;
    private DatabaseManager databaseManager;

    public SplashPresenter(SplashActivity newActivity) {
        activity = newActivity;
        databaseManager = new DatabaseManager();

        checkDatabase();
    }

    private void checkDatabase() {
        databaseManager.createDatabase();
        databaseManager.seedDatabase();
    }

    @Override
    public void goToMenu() {
        activity.goToMenu();
    }
}
