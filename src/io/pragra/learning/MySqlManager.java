package io.pragra.learning;

import java.util.AbstractCollection;

public class MySqlManager extends DatabaseManager{
    public MySqlManager(String dbVersion) {
        super(dbVersion);
    }

    @Override
    public String getDBName() {
        return "MYSQL";
    }

}
