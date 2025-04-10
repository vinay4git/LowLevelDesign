package DesignPatterns.structural.ProxyPattern;

public class ProxyPatternMain {
    public static void main(String[] args) {
        EmployeeDaoProxy employeeDaoProxy = new EmployeeDaoProxy();
        employeeDaoProxy.getEmployee(UserType.USER, "123");
        employeeDaoProxy.deleteEmployee(UserType.USER, "123");
    }
}
