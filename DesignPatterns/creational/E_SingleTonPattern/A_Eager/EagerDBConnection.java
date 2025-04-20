package DesignPatterns.creational.E_SingleTonPattern.A_Eager;

public class EagerDBConnection {
    private static final EagerDBConnection eagerDbConnection = new EagerDBConnection();
    String dbName;

    private EagerDBConnection() {
    }

    public static EagerDBConnection getInstance(){
        return eagerDbConnection;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }
}
