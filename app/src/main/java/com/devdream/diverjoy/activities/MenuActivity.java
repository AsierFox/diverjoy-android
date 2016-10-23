package com.devdream.diverjoy.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.devdream.diverjoy.R;
import com.devdream.diverjoy.presenters.MenuPresenter;

public class MenuActivity extends AppCompatActivity {

    private MenuPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        presenter = new MenuPresenter(this);
    }
}
