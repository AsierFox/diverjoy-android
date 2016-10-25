package com.devdream.diverjoy.vo;

import com.devdream.diverjoy.entities.Question;
import com.devdream.diverjoy.entities.Topic;

import java.util.ArrayList;

public class GameVO {

    private String name;
    private String description;
    private String cardColor;
    private ArrayList<Topic> topics;
    private ArrayList<Question> questions;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String _description) {
        description = _description;
    }

    public String getCardColor() {
        return cardColor;
    }
    public void setCardColor(String _cardColor) {
        cardColor = _cardColor;
    }

    public ArrayList<Topic> getTopics() {
        return topics;
    }
    public void setTopics(ArrayList<Topic> _topics) {
        topics = _topics;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }
    public void setQuestions(ArrayList<Question> _questions) {
        questions = _questions;
    }
}
