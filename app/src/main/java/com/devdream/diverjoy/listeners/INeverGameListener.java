package com.devdream.diverjoy.listeners;

import com.devdream.diverjoy.db.vo.QuestionVO;

import java.util.ArrayList;

public interface INeverGameListener {
    void loadQuestion(QuestionVO questionVO);
    void loadedQuestions(ArrayList<QuestionVO> questionVOs);
}
