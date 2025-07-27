package LowLevelDesigns.RoleBasedResourceAccess;

import LowLevelDesigns.RoleBasedResourceAccess.model.PermissionLevel;
import LowLevelDesigns.RoleBasedResourceAccess.model.role.Manager;
import LowLevelDesigns.RoleBasedResourceAccess.service.ResourceManager;
import LowLevelDesigns.RoleBasedResourceAccess.service.ResourceProxyImpl;

import java.util.Set;

public class RoleBasedAccess {

    public static void main(String[] args) {

        ResourceManager resourceManager = new ResourceManager();

        String doucment123 = "123";
        resourceManager.addResource(doucment123, Set.of(PermissionLevel.EXECUTE));

        ResourceProxyImpl resourceProxy = new ResourceProxyImpl(resourceManager);

        resourceProxy.readDocument(doucment123,Manager.getInstance());
        //resourceProxy.readDocument(doucment123,);


    }
}