package com.devdream.diverjoy.db.vo;

public class QuestionVO {

    private String question;

    private boolean appeared;

    public QuestionVO() {
        appeared = false;
    }

    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isAppeared() {
        return appeared;
    }
    public void setAppeared(boolean appeared) {
        this.appeared = appeared;
    }
}
