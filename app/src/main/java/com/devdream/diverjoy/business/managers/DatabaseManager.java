package com.devdream.diverjoy.business.managers;

import com.devdream.diverjoy.business.services.DatabaseService;
import com.devdream.diverjoy.db.DBSeeder;

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
