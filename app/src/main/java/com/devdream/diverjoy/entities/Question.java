package com.devdream.diverjoy.entities;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Question extends RealmObject {

    @PrimaryKey
    private int id;
    private String question;


    public int getId() {
        return id;
    }
    public void setId(int newId) {
        id = newId;
    }

    public String getQuestion() {
        return question;
    }
    public void setQuestion(String newQquestion) {
        question = newQquestion;
    }
}
