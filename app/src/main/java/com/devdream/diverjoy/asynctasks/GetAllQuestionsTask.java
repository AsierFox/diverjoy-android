package com.devdream.diverjoy.asynctasks;

import android.os.AsyncTask;

import com.devdream.diverjoy.db.vo.QuestionVO;
import com.devdream.diverjoy.listeners.INeverGameListener;
import com.devdream.diverjoy.repositories.INeverGameRepository;

import java.util.ArrayList;

public class GetAllQuestionsTask  extends AsyncTask<Void, Void, Void> {

    private INeverGameListener listener;
    private INeverGameRepository repository;

    private ArrayList<QuestionVO> questionVOs;

    public GetAllQuestionsTask(INeverGameListener _listener, INeverGameRepository _repository) {
        listener = _listener;
        repository = _repository;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        questionVOs = repository.getQuestions();
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        listener.loadedQuestions(questionVOs);
    }
}
