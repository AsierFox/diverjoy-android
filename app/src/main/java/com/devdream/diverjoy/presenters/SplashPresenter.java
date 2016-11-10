package com.devdream.diverjoy.presenters;

import com.devdream.diverjoy.asynctasks.DatabaseCheckCreationTask;
import com.devdream.diverjoy.activities.SplashActivity;
import com.devdream.diverjoy.context.AppContext;
import com.devdream.diverjoy.listeners.SplashListener;

import io.realm.Realm;

public class SplashPresenter implements SplashListener {

    private SplashActivity activity;

    public SplashPresenter(SplashActivity newActivity) {
        activity = newActivity;
        Realm.init(AppContext.getContext());
    }

    public void checkDatabase() {
        new DatabaseCheckCreationTask(this).execute();
    }

    @Override
    public void goToMenu() {
        activity.goToMenu();
    }
}
