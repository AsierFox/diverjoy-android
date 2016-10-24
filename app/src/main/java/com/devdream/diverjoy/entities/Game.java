package com.devdream.diverjoy.entities;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Game extends RealmObject {

    @PrimaryKey
    private int id;
    private String name;
    private String description;
    private RealmList<Topic> topics;
    private RealmList<Question> questions;


    public int getId() {
        return id;
    }
    public void setId(int newId) {
        id = newId;
    }

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String newDescription) {
        description = newDescription;
    }

    public RealmList<Topic> getTopics() {
        return topics;
    }
    public void setTopics(RealmList<Topic> newTopics) {
        topics = newTopics;
    }

    public RealmList<Question> getQuestions() {
        return questions;
    }
    public void setQuestions(RealmList<Question> newQuestions) {
        questions = newQuestions;
    }
}
