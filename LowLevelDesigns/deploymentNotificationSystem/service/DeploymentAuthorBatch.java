package LowLevelDesigns.deploymentNotificationSystem.service;

import LowLevelDesigns.deploymentNotificationSystem.model.DeploymentAuthor;
import LowLevelDesigns.deploymentNotificationSystem.model.EventStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeploymentAuthorBatch {

    private static List<DeploymentAuthor> deploymentAuthors = new ArrayList<>();

    static DeploymentAuthorBatch deploymentAuthorBatch = new DeploymentAuthorBatch();

    public static DeploymentAuthorBatch getInstance() {
        return deploymentAuthorBatch;
    }

    public void setDeploymentAuthorBatch(List<DeploymentAuthor> deploymentAuthorBatch) {
        deploymentAuthors = deploymentAuthorBatch;
    }

    public List<DeploymentAuthor> getDeploymentAuthors() {
        return deploymentAuthors;
    }
}
