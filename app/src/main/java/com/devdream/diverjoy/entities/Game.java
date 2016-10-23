package com.devdream.diverjoy.entities;

import io.realm.RealmObject;

public class Game extends RealmObject {
    private String name;
    private String description;


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
}
