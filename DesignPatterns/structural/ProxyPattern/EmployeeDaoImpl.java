package DesignPatterns.structural.ProxyPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public Employee getEmployee(UserType userType,String id) {
        System.out.println("Do the DB operation of get Employee");
        return null;
    }

    @Override
    public void updateEmployee(UserType userType,String id, Employee employee) {
        System.out.println("Do the DB operation of update Employee");
    }

    @Override
    public void deleteEmployee(UserType userType,String id) {
        System.out.println("Do the DB operation of delete Employee");
    }
}
