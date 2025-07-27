package LowLevelDesigns.RoleBasedResourceAccess.service;


import LowLevelDesigns.RoleBasedResourceAccess.model.Resource;
import LowLevelDesigns.RoleBasedResourceAccess.model.role.User;

public interface ResourceProxyLayer {
    Resource readDocument(String resourceName, User user);

}
