package com.devdream.diverjoy.adapters;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.devdream.diverjoy.R;
import com.devdream.diverjoy.vo.GameVO;

import java.util.ArrayList;

public class GameListAdapter extends RecyclerView.Adapter<GameListAdapter.ViewHolder> {

    private ArrayList<GameVO> games;
    private int listLength;

    // TODO Pass the ArrayList objects
    public GameListAdapter(ArrayList<GameVO> _games) {
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
        GameVO game = games.get(position);
        holder.textTextView.setBackgroundColor(Color.parseColor(game.getCardColor()));
        holder.textTextView.setText(game.getName());
    }

    @Override
    public int getItemCount() {
        return listLength;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textTextView;

        private ViewHolder(View itemView) {
            super(itemView);

            textTextView = (TextView) itemView.findViewById(R.id.gameListItemTextView);
        }
    }
}
