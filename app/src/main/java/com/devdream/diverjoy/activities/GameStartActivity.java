package com.devdream.diverjoy.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.devdream.diverjoy.R;
import com.devdream.diverjoy.listeners.GameStartListener;
import com.devdream.diverjoy.presenters.GameStartPresenter;


public class GameStartActivity extends AppCompatActivity implements GameStartListener {

    private GameStartPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start);
    }
}
