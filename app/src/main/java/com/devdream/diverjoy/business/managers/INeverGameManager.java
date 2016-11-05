package com.devdream.diverjoy.business.managers;

import com.devdream.diverjoy.asynctasks.GetAllQuestionsTask;
import com.devdream.diverjoy.db.vo.QuestionVO;
import com.devdream.diverjoy.listeners.INeverGameListener;
import com.devdream.diverjoy.repositories.INeverGameRepository;

import java.util.ArrayList;
import java.util.Random;

public class INeverGameManager {

    private INeverGameListener listener;
    private INeverGameRepository repository;

    private Random random;

    public INeverGameManager(INeverGameListener _listener) {
        listener = _listener;
        repository = new INeverGameRepository();
        random = new Random();
        getAllQuestions();
    }

    public QuestionVO getNextQuestion(ArrayList<QuestionVO> questionVOs) {
        if (questionVOs.isEmpty()) {
            return null;
        }
        int questionIndex;
        int questionVOsSize = questionVOs.size();
        QuestionVO questionVO;
        do {
            questionIndex = random.nextInt(questionVOsSize);
            questionVO = questionVOs.get(questionIndex);
        } while(!questionVO.isAppeared());

        return questionVOs.remove(questionIndex);
    }

    public void getAllQuestions() {
        new GetAllQuestionsTask(listener, repository).execute();
    }
}
