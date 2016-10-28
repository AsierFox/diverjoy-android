package com.devdream.diverjoy.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.devdream.diverjoy.R;
import com.devdream.diverjoy.adapters.GameListAdapter;
import com.devdream.diverjoy.context.AppContext;
import com.devdream.diverjoy.listeners.MenuListener;
import com.devdream.diverjoy.presenters.MenuPresenter;
import com.devdream.diverjoy.db.vo.GameVO;
import com.devdream.diverjoy.utils.Consts;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity implements MenuListener {

    private MenuPresenter presenter;

    private RecyclerView allGamesRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        allGamesRecyclerView = (RecyclerView) findViewById(R.id.menuAllGamesRecyclerView);

        presenter = new MenuPresenter(this);

        presenter.getAllGames();
    }

    private void displayGamesRecyclerView(ArrayList<GameVO> games) {
        allGamesRecyclerView.setHasFixedSize(true);
        allGamesRecyclerView.setLayoutManager(new LinearLayoutManager(AppContext.getContext()));
        allGamesRecyclerView.setAdapter(new GameListAdapter(this, games));
    }

    @Override
    public void loadingGameList() {
    }

    @Override
    public void gameListLoaded(ArrayList<GameVO> games) {
        displayGamesRecyclerView(games);
    }

    @Override
    public void choseGameOnClick(GameVO gameVO) {
        Intent chooseGameIntent = new Intent(AppContext.getContext(), GameStartActivity.class);
        chooseGameIntent.putExtra(Consts.Extras.CHOOSE_GAME_ID, gameVO.getId());
        startActivity(chooseGameIntent);
    }
}
