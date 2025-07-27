package LowLevelDesigns.RoleBasedResourceAccess.model;

import java.util.Set;

public class Resource {
    private String resourceName;

    private Set<PermissionLevel> permissionLevel;

    public Resource(String resourceName, Set<PermissionLevel> permissionLevel) {
        this.resourceName = resourceName;
        this.permissionLevel = permissionLevel;
    }

    public void setPermissionLevel(Set<PermissionLevel> permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    public Set<PermissionLevel> getPermissionLevel() {
        return permissionLevel;
    }
}
