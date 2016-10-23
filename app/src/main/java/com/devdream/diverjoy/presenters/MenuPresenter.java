package com.devdream.diverjoy.presenters;

import com.devdream.diverjoy.activities.MenuActivity;
import com.devdream.diverjoy.managers.MenuManager;

public class MenuPresenter {

    private MenuActivity activity;
    private MenuManager manager;

    public MenuPresenter(MenuActivity newActivity) {
        activity = newActivity;
    }
}
