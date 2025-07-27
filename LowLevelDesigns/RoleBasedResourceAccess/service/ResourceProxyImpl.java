package LowLevelDesigns.RoleBasedResourceAccess.service;


import LowLevelDesigns.RoleBasedResourceAccess.model.PermissionLevel;
import LowLevelDesigns.RoleBasedResourceAccess.model.Resource;
import LowLevelDesigns.RoleBasedResourceAccess.model.role.User;

import java.util.Set;

public class ResourceProxyImpl implements ResourceProxyLayer{

    ResourceManager resourceManager;

    public ResourceProxyImpl(ResourceManager resourceManager) {
        this.resourceManager = resourceManager;
    }

    @Override
    public Resource readDocument(String resourceName, User user) {
        Resource resource = resourceManager.getResource(resourceName);

        Set<PermissionLevel> permissionLevel = resource.getPermissionLevel();

        boolean userAuthorized = user.getAllPermissions().contains(PermissionLevel.READ);

        boolean resourceIsAccessedToRead = permissionLevel.contains(PermissionLevel.READ);

        if (userAuthorized && resourceIsAccessedToRead) {
            System.out.println("Has permissions to access the resource" + user.groupName);
            return  resource;
        } else if (userAuthorized) {
            System.out.println("Employee Group Don't have permissions to access the resource");
        } else {
            System.out.println("Resource doesn't have permission level");
        }
        return null;
    }
}
