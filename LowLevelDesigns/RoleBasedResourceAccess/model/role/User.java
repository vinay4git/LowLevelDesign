package LowLevelDesigns.RoleBasedResourceAccess.model.role;


import LowLevelDesigns.RoleBasedResourceAccess.model.PermissionLevel;

import java.util.List;

public abstract class User {
    public String groupName;
    public abstract List<PermissionLevel> getAllPermissions();
}
