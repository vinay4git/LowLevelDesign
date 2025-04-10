package DesignPatterns.structural.ProxyPattern;

public class ProxyPatternMain {
    public static void main(String[] args) {
        EmployeeDaoProxy employeeDaoProxy = new EmployeeDaoProxy();
        employeeDaoProxy.getEmployee(UserType.USER, "123");
        employeeDaoProxy.updateEmployee(UserType.ADMIN,"123",new EmployeeDo());
        employeeDaoProxy.deleteEmployee(UserType.USER, "123");
    }
}
