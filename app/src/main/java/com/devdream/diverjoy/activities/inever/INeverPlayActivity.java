package com.devdream.diverjoy.activities.inever;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.devdream.diverjoy.R;
import com.devdream.diverjoy.listeners.INeverGameListener;

public class INeverPlayActivity extends AppCompatActivity implements INeverGameListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_never_play);
    }

    public void nextQuestion(View view) {
        Log.d("MEW", "NEXT Question");
    }
}
