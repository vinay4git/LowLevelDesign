package DesignPatterns.creational.E_SingleTonPattern;

import DesignPatterns.creational.E_SingleTonPattern.A_Eager.EagerDBConnection;
import DesignPatterns.creational.E_SingleTonPattern.B_Lazy.LazyDbConnection;
import DesignPatterns.creational.E_SingleTonPattern.C_Synchronization.SyncDbConnection;
import DesignPatterns.creational.E_SingleTonPattern.D_DoubleLocking.DoubleLockingDbConnection;

public class SingleTonMain {
    public static void main(String[] args) {

        EagerDBConnection eagerInstance = EagerDBConnection.getInstance();
        eagerInstance.setDbName("Eager DBConnection");
        System.out.println(EagerDBConnection.getInstance().getDbName());

        LazyDbConnection lazyDbConnection = LazyDbConnection.getInstance();
        lazyDbConnection.setDbName("Lazy DB Connection");
        System.out.println(LazyDbConnection.getInstance().getDbName());

        SyncDbConnection syncDbConnection = SyncDbConnection.getInstance();
        syncDbConnection.setDbName("Sync DB Connection");
        System.out.println(SyncDbConnection.getInstance().getDbName());

        DoubleLockingDbConnection doubleLockingDbConnection = DoubleLockingDbConnection.getInstance();
        doubleLockingDbConnection.setDbName("Double Locking DB Connection");
        System.out.println(DoubleLockingDbConnection.getInstance().getDbName());
    }
}
