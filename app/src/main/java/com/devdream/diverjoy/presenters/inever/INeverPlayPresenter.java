package com.devdream.diverjoy.presenters.inever;

import com.devdream.diverjoy.activities.inever.INeverPlayActivity;
import com.devdream.diverjoy.db.vo.QuestionVO;
import com.devdream.diverjoy.listeners.INeverGameListener;
import com.devdream.diverjoy.business.managers.INeverGameManager;

import java.util.ArrayList;

public class INeverPlayPresenter implements INeverGameListener {

    private INeverPlayActivity activity;
    private INeverGameManager manager;

    private ArrayList<QuestionVO> questionVOs;

    public INeverPlayPresenter(INeverPlayActivity _activity) {
        activity = _activity;
        manager = new INeverGameManager(this);
    }

    // TODO Make button disabled till the questions are loaded
    public void getNextQuestion() {
        loadQuestion(manager.getNextQuestion(questionVOs));
    }

    @Override
    public void loadQuestion(QuestionVO questionVO) {
        activity.loadQuestion(questionVO);
    }

    @Override
    public void loadedQuestions(ArrayList<QuestionVO> _questionVOs) {
        questionVOs = _questionVOs;
        getNextQuestion();
    }
}
