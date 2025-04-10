package DesignPatterns.structural.ProxyPattern;

public interface EmployeeDao {

    EmployeeDo getEmployee(UserType userType, String id);

    void updateEmployee(UserType userType, String id, EmployeeDo employeeDo);

    void deleteEmployee(UserType userType, String id);
}
