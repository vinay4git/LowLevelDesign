package LowLevelDesigns.RoleBasedResourceAccess.model.role;


import LowLevelDesigns.RoleBasedResourceAccess.model.PermissionLevel;

import java.util.ArrayList;
import java.util.List;

public class Employee extends User {

    private static final List<PermissionLevel> permissions = new ArrayList<>();

    private static final Employee employee = new Employee();

    public Employee() {
    }

    static {
        permissions.add(PermissionLevel.READ);
    }

    public static Employee getInstance() {
        return employee;
    }

    public List<PermissionLevel> getAllPermissions(){
        return permissions;
    }

}
