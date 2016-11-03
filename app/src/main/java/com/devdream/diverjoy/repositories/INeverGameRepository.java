package com.devdream.diverjoy.repositories;

import com.devdream.diverjoy.db.RealmHelper;
import com.devdream.diverjoy.db.entities.Question;
import com.devdream.diverjoy.db.vo.QuestionVO;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class INeverGameRepository {

    public ArrayList<QuestionVO> getQuestions() {
        Realm realm = Realm.getInstance(RealmHelper.getRealmConfiguration());
        RealmResults<Question> questions = realm.where(Question.class).findAll();
        ArrayList<QuestionVO> questionVOs = new ArrayList<>();
        for (Question question : questions) {
            QuestionVO questionVO = new QuestionVO();
            questionVO.setQuestion(question.getQuestion());
            questionVOs.add(questionVO);
        }
        realm.close();
        return questionVOs;
    }
}
