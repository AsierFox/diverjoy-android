package com.devdream.diverjoy.managers;

import com.devdream.diverjoy.services.DatabaseService;

public class DatabaseManager {

    private DatabaseService service;

    public DatabaseManager() {
        service = new DatabaseService();
    }

    public boolean isDatabaseCreated() {
        return service.isDatabaseCreated();
    }

    public void seedDatabase() {
    }
}
