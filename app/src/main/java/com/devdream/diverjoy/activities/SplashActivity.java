package com.devdream.diverjoy.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.devdream.diverjoy.R;
import com.devdream.diverjoy.context.AppContext;
import com.devdream.diverjoy.listeners.SplashListener;
import com.devdream.diverjoy.presenters.SplashPresenter;

public class SplashActivity extends AppCompatActivity implements SplashListener {

    private SplashPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splah);

        presenter = new SplashPresenter(this);
    }

    @Override
    public void goToMenu() {
        Intent intent = new Intent(AppContext.getContext(), MenuActivity.class);
        startActivity(intent);
    }
}
