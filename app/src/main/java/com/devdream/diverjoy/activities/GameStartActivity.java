package com.devdream.diverjoy.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.devdream.diverjoy.R;
import com.devdream.diverjoy.context.AppContext;
import com.devdream.diverjoy.db.vo.GameVO;
import com.devdream.diverjoy.listeners.GameStartListener;
import com.devdream.diverjoy.presenters.GameStartPresenter;
import com.devdream.diverjoy.utils.Consts;

public class GameStartActivity extends AppCompatActivity implements GameStartListener {

    private GameStartPresenter presenter;

    private TextView gameNameTextView;
    private TextView gameDescriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start);

        gameNameTextView = (TextView) findViewById(R.id.gameStartGameNameTextView);
        gameDescriptionTextView = (TextView) findViewById(R.id.gameStartGameDescriptionTextView);

        String gameId = getIntent().getStringExtra(Consts.Extras.CHOOSE_GAME_ID);

        presenter = new GameStartPresenter(this, gameId);

        presenter.getGameInformation();
    }

    public void startGameOnClick(View view) {
        presenter.startGame();
    }

    @Override
    public void loadGame(GameVO gameVO) {
        gameNameTextView.setText(gameVO.getName());
        gameDescriptionTextView.setText(gameVO.getDescription());
    }

    @Override
    public void startGame() {
        Intent startGameIntent = new Intent(AppContext.getContext(), presenter.getSelectedGameActivity());
        startActivity(startGameIntent);
    }
}
