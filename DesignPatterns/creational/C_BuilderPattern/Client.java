package DesignPatterns.creational.C_BuilderPattern;

public class Client {
    public static void main(String[] args) {
        StudentManger mbaStudentManger = new StudentManger(new MBAStudent());

        Student mbaStudent = mbaStudentManger.createStudent();


        StudentManger engStudentManger = new StudentManger(new EngineeringStudent());
        Student engStudent = engStudentManger.createStudent();

        System.out.println(mbaStudent);
        System.out.println(engStudent);
    }
}
