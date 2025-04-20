package DesignPatterns.creational.D_PrototypePattern;

public class PrototypeMain {
    public static void main(String[] args) {
        Student vinay = new Student("vinay", 123213413, 12);

        Student vinayClone = vinay.doClone();

        System.out.println("Vinay :" + vinay);
        System.out.println("Vinay Clone :" + vinayClone);
    }
}
