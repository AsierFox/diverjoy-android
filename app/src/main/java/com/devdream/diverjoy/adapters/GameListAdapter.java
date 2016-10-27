package com.devdream.diverjoy.adapters;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.devdream.diverjoy.R;
import com.devdream.diverjoy.listeners.ChoseGameOnClickListener;
import com.devdream.diverjoy.listeners.MenuListener;
import com.devdream.diverjoy.vo.GameVO;

import java.util.ArrayList;

public class GameListAdapter extends RecyclerView.Adapter<GameListAdapter.ViewHolder> {

    private MenuListener menuListener;
    private ArrayList<GameVO> games;
    private int listLength;

    public GameListAdapter(MenuListener listener, ArrayList<GameVO> _games) {
        menuListener = listener;
        games = _games;
        listLength = games.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.game_list_recycler_view_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final GameVO game = games.get(position);
        ChoseGameOnClickListener choseGameOnClickListener = new ChoseGameOnClickListener(menuListener, game);

        holder.textTextView.setBackgroundColor(Color.parseColor(game.getCardColor()));
        holder.textTextView.setText(game.getName());
        holder.textTextView.setOnClickListener(choseGameOnClickListener);
    }

    @Override
    public int getItemCount() {
        return listLength;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textTextView;

        private ViewHolder(View itemView) {
            super(itemView);
            textTextView = (TextView) itemView.findViewById(R.id.gameListItemGameNameTextView);
        }
    }
}
