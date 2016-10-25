package com.devdream.diverjoy.managers;

import com.devdream.diverjoy.db.DBSeeder;
import com.devdream.diverjoy.services.DatabaseService;

public class DatabaseManager {

    private DatabaseService service;
    private DBSeeder seeder;

    public DatabaseManager() {
        service = new DatabaseService();
        seeder = new DBSeeder();
    }

    public boolean isDatabaseCreated() {
        return service.isDatabaseCreated();
    }

    public void seedDatabase() {
        seeder.seed();
    }
}
