package LowLevelDesigns.RoleBasedResourceAccess.model.role;


import LowLevelDesigns.RoleBasedResourceAccess.model.PermissionLevel;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    private static final List<PermissionLevel> permissions = new ArrayList<>();
    private static final Manager manager = new Manager();
    public Manager() {
    }

    static {
        permissions.add(PermissionLevel.WRITE);
    }

    public static Manager getInstance() {
        return manager;
    }

    public List<PermissionLevel> getAllPermissions(){
        List<PermissionLevel> permissions = super.getAllPermissions();
        permissions.addAll(Manager.permissions);

        return permissions;
    }

}
