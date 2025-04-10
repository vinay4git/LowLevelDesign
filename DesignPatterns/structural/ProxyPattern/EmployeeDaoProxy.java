package DesignPatterns.structural.ProxyPattern;

public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDaoImpl employeeDaoImpl;

    public EmployeeDaoProxy() {
        this.employeeDaoImpl = new EmployeeDaoImpl();
    }

    @Override
    public Employee getEmployee(UserType userType,String id) {
        if (userType.equals(UserType.ADMIN) || userType.equals(UserType.USER)) {
            employeeDaoImpl.getEmployee(userType, id);
        } else {
            System.out.println("Operation Access denied");
        }
        return null;
    }

    @Override
    public void updateEmployee(UserType userType,String id, Employee employee) {
        if (userType.equals(UserType.ADMIN)) {
            employeeDaoImpl.updateEmployee(userType, id, employee);
        } else {
            System.out.println("Operation Access denied");
        }
    }

    @Override
    public void deleteEmployee(UserType userType, String id) {
        if (userType.equals(UserType.ADMIN)) {
            employeeDaoImpl.deleteEmployee(userType, id);
        } else {
            System.out.println("Operation Access denied");
        }
    }
}
