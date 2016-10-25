package com.devdream.diverjoy.presenters;

import com.devdream.diverjoy.asynctasks.DatabaseCheckCreationTask;
import com.devdream.diverjoy.activities.SplashActivity;
import com.devdream.diverjoy.context.AppContext;
import com.devdream.diverjoy.listeners.SplashListener;

import io.realm.Realm;

public class SplashPresenter implements SplashListener {

    private SplashActivity activity;

    private DatabaseCheckCreationTask databaseCheckCreationTask;

    public SplashPresenter(SplashActivity newActivity) {
        activity = newActivity;
        databaseCheckCreationTask = new DatabaseCheckCreationTask(this);
        Realm.init(AppContext.getContext());
    }

    public void checkDatabase() {
        databaseCheckCreationTask.execute();
    }

    @Override
    public void goToMenu() {
        activity.goToMenu();
    }
}
