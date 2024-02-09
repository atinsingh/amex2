package io.pragra.learning;

import io.pragra.learning.drivers.MongoDriver;
import io.pragra.learning.drivers.MySqlDriver;
import io.pragra.learning.drivers.OracleDriver;

public abstract class DatabaseManager {
    private String dbVersion;

    public DatabaseManager(String dbVersion) {
        this.dbVersion = dbVersion;
    }

    public abstract String getDBName();

    public void executeInsert(){
        if(getDBName().toUpperCase().equals("MONGO")) {
            MongoDriver driver  = new MongoDriver();
            driver.insert();
        }else if(getDBName().toUpperCase().equals("MYSQL")){
            new MySqlDriver().insert();
        }else if(getDBName().toUpperCase().equals("ORACLE")){
            new OracleDriver().insert();
        }else {
            System.out.println("NOT A VALID DATABASE");
        }
    }
}

/*
 Abstract classes are the classes which is declared with keyword abstract and may have abstract method


 */
