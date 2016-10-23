package com.devdream.diverjoy.services;

import com.devdream.diverjoy.repositories.DatabaseRepository;

public class DatabaseService {

    private DatabaseRepository repository;

    public DatabaseService() {
        repository = new DatabaseRepository();
    }

    public boolean isDatabaseCreated() {
        return repository.getDatabase() != null;
    }
}
