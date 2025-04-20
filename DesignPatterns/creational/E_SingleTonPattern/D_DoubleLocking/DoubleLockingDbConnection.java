package DesignPatterns.creational.E_SingleTonPattern.D_DoubleLocking;

public class DoubleLockingDbConnection {
    private static DoubleLockingDbConnection dbConnection;
    private String dbName;

    private DoubleLockingDbConnection() {
    }

    public static DoubleLockingDbConnection getInstance(){
        if (dbConnection == null) {
            synchronized (DoubleLockingDbConnection.class) {
                if (dbConnection == null) {
                    dbConnection = new DoubleLockingDbConnection();
                }
            }
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
