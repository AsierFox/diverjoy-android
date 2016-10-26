package com.devdream.diverjoy.entities;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Game extends RealmObject {

    @PrimaryKey
    private String id;
    private String name;
    private String description;
    private String cardColor;
    private RealmList<Topic> topics;
    private RealmList<Question> questions;


    public String getId() {
        return id;
    }
    public void setId(String newId) {
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

    public String getCardColor() {
        return cardColor;
    }

    public void setCardColor(String newCardColor) {
        cardColor = newCardColor;
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
