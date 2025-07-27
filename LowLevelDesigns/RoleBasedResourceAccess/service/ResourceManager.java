package LowLevelDesigns.RoleBasedResourceAccess.service;


import LowLevelDesigns.RoleBasedResourceAccess.model.PermissionLevel;
import LowLevelDesigns.RoleBasedResourceAccess.model.Resource;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ResourceManager {

    Map<String, Resource> resourceMap;

    public ResourceManager() {
        this.resourceMap = new HashMap<>();
    }

    public Resource getResource(String resourceName) {
        return resourceMap.get(resourceName);
    }

    public void addResource(String resourceName, Set<PermissionLevel> permissionLevels) {
        resourceMap.put(resourceName, new Resource(resourceName, permissionLevels));
    }

    public void updateResourcePermissions(String resourceName, PermissionLevel permissionLevel) {
        Resource resource = resourceMap.get(resourceName);

        if(resource == null) {
            throw new RuntimeException("Updating a Resource which is not present.");
        }

        //resource.setPermissionLevel(permissionLevel);
    }
}
