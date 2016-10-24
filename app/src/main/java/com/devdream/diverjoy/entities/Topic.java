package com.devdream.diverjoy.entities;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Topic extends RealmObject {

    @PrimaryKey
    private int id;
    private String topic;


    public int getId() {
        return id;
    }
    public void setId(int newId) {
        id = newId;
    }

    public String getTopic() {
        return topic;
    }
    public void setTopic(String newTopic) {
        topic = newTopic;
    }
}
