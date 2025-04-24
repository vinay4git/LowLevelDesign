package DesignPatterns.creational.E_SingleTonPattern.F_EnumWay;

public enum EnumSingleTon {
    INSTANCE;

    int a = 1;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
