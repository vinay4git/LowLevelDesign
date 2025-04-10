package DesignPatterns.structural.ProxyPattern;

public interface EmployeeDao {

    Employee getEmployee(UserType userType,String id);

    void updateEmployee(UserType userType, String id, Employee employee);

    void deleteEmployee(UserType userType, String id);
}
