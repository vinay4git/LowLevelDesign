package DesignPatterns.structural.B_ProxyPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public EmployeeDo getEmployee(UserType userType, String id) {
        System.out.println("Do the DB operation of get EmployeeDo");
        return null;
    }

    @Override
    public void updateEmployee(UserType userType,String id, EmployeeDo employeeDo) {
        System.out.println("Do the DB operation of update EmployeeDo");
    }

    @Override
    public void deleteEmployee(UserType userType,String id) {
        System.out.println("Do the DB operation of delete EmployeeDo");
    }
}
