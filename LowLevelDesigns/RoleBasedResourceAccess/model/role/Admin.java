package LowLevelDesigns.RoleBasedResourceAccess.model.role;


import LowLevelDesigns.RoleBasedResourceAccess.model.PermissionLevel;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Manager {
    private static final List<PermissionLevel> permissions = new ArrayList<>();

    private static final Admin admin = new Admin();
    {
        permissions.add(PermissionLevel.EXECUTE);
    }
    private Admin() {
    }

    public static Admin getInstance() {
        return admin;
    }


    public List<PermissionLevel> getAllPermissions(){
        List<PermissionLevel> permissions = super.getAllPermissions();
        permissions.addAll(Admin.permissions);

        return permissions;
    }
}
