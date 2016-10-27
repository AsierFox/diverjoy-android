package com.devdream.diverjoy.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.devdream.diverjoy.R;
import com.devdream.diverjoy.utils.Consts;
import com.devdream.diverjoy.context.AppContext;
import com.devdream.diverjoy.listeners.SplashListener;
import com.devdream.diverjoy.presenters.SplashPresenter;
import com.squareup.picasso.Picasso;

public class SplashActivity extends AppCompatActivity implements SplashListener {

    private SplashPresenter presenter;

    private ImageView splashImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashImageView = (ImageView) findViewById(R.id.splashImageView);

        presenter = new SplashPresenter(this);

        presenter.checkDatabase();

        Picasso.with(AppContext.getContext())
                .load(Consts.Assets.IMAGES + "init_splash.jpg")
                .into(splashImageView);
    }

    @Override
    public void goToMenu() {
        Intent intent = new Intent(AppContext.getContext(), MenuActivity.class);
        startActivity(intent);
    }
}
