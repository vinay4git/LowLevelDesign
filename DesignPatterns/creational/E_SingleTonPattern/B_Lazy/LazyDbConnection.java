package DesignPatterns.creational.E_SingleTonPattern.B_Lazy;

public class LazyDbConnection {
    private static LazyDbConnection dbConnection;
    private String dbName;

    private LazyDbConnection() {
    }

    public static LazyDbConnection getInstance() {
        if (dbConnection == null){
            dbConnection = new LazyDbConnection();
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
