package com.devdream.diverjoy.activities.inever;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.devdream.diverjoy.R;
import com.devdream.diverjoy.db.vo.QuestionVO;
import com.devdream.diverjoy.listeners.INeverGameListener;
import com.devdream.diverjoy.presenters.inever.INeverPlayPresenter;

import java.util.ArrayList;

public class INeverPlayActivity extends AppCompatActivity implements INeverGameListener {

    private INeverPlayPresenter presenter;

    private TextView questionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_never_play);

        questionTextView = (TextView) findViewById(R.id.iNeverPlayQuestionTextView);

        presenter = new INeverPlayPresenter(this);
    }

    public void nextQuestion(View view) {
        presenter.getNextQuestion();
    }

    @Override
    public void loadQuestion(QuestionVO questionVO) {
        questionTextView.setText(questionVO.getQuestion());
    }

    @Override
    public void loadedQuestions(ArrayList<QuestionVO> questionVOs) {
    }
}
