package com.devdream.diverjoy.context;

import android.app.Application;
import android.content.Context;

/**
 * Holds the context of the application.
 */
public class AppContext extends Application {

    private static AppContext instance;

    @Override
    public void onCreate() {
        instance = this;
        super.onCreate();
    }

    public static Context getContext(){
        return instance.getApplicationContext();
    }
}
