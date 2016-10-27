package com.devdream.diverjoy.entities;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Word extends RealmObject {

    @PrimaryKey
    private int id;
    private String word;
    private RealmList<Word> tabooWords;


    public int getId() {
        return id;
    }
    public void setId(int newId) {
        id = newId;
    }

    public String getWord() {
        return word;
    }
    public void setWord(String newWord) {
        word = newWord;
    }

    public RealmList<Word> getTabooWords() {
        return tabooWords;
    }
    public void setTabooWords(RealmList<Word> _tabooWords) {
        tabooWords = _tabooWords;
    }
}
