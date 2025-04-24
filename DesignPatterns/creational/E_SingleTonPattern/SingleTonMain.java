package DesignPatterns.creational.E_SingleTonPattern;

import DesignPatterns.creational.E_SingleTonPattern.A_Eager.EagerDBConnection;
import DesignPatterns.creational.E_SingleTonPattern.B_Lazy.LazyDbConnection;
import DesignPatterns.creational.E_SingleTonPattern.C_Synchronization.SyncDbConnection;
import DesignPatterns.creational.E_SingleTonPattern.D_DoubleLocking.DoubleLockingDbConnection;
import DesignPatterns.creational.E_SingleTonPattern.F_EnumWay.EnumSingleTon;

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

        // Enum has constructor as private. So it can be used for singeleton and JVM ensures only once the
        // instance is created during its first usage in the project. From second jvm will ensure we will get same object.
        EnumSingleTon enumSingleTon = EnumSingleTon.INSTANCE;
        enumSingleTon.setA(10);
        System.out.println(enumSingleTon.getA());

        EnumSingleTon instance = EnumSingleTon.INSTANCE;
        System.out.println(instance.getA());

    }
}
