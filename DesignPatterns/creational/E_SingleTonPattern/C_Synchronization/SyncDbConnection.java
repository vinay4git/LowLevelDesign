package DesignPatterns.creational.E_SingleTonPattern.C_Synchronization;

import DesignPatterns.creational.E_SingleTonPattern.B_Lazy.LazyDbConnection;

public class SyncDbConnection {
    private static SyncDbConnection dbConnection;
    private String dbName;

    private SyncDbConnection() {
    }

    public static synchronized SyncDbConnection getInstance() {
        if (dbConnection == null){
            dbConnection = new SyncDbConnection();
        }
        return dbConnection;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }
}
