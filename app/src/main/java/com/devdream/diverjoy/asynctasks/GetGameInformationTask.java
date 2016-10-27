package com.devdream.diverjoy.asynctasks;

import android.os.AsyncTask;

import com.devdream.diverjoy.managers.GameManager;

public class GetGameInformationTask extends AsyncTask<Void, Void, Void> {

    private GameManager gameManager;

    @Override
    protected void onPreExecute() {
        gameManager = new GameManager();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        return null;
    }
}
