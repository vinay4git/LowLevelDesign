package LowLevelDesigns.deploymentNotificationSystem.service;

import LowLevelDesigns.deploymentNotificationSystem.model.DeploymentAuthor;
import LowLevelDesigns.deploymentNotificationSystem.model.Event;
import LowLevelDesigns.deploymentNotificationSystem.model.EventStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventService {
    Map<String, DeploymentAuthor> pendingAuthorsToBeNotified;
    DeploymentAuthorBatch deploymentAuthorBatch;

    public EventService() {
        this.deploymentAuthorBatch = DeploymentAuthorBatch.getInstance();
        pendingAuthorsToBeNotified =  new HashMap<>();
    }

    public void handleEvent(Event event) {
        event.getAuthors()
                .forEach(author -> {
                    pendingAuthorsToBeNotified.merge(author.getName(), new DeploymentAuthor(author, event.getVersion()), (deploymentAuthor, deploymentAuthor2) -> {
                        deploymentAuthor.setVersion(event.getVersion());
                        return deploymentAuthor;
                    });
                    //pendingAuthorsToBeNotified.putIfAbsent(author.getName(), new DeploymentAuthor(author, event.getVersion()));


/*                    List<DeploymentAuthor> deploymentAuthors = deploymentAuthorBatch.getDeploymentAuthorMap()
                            .getOrDefault(event.getEventStatus(), new ArrayList<>());
                    DeploymentAuthor deploymentAuthor = new DeploymentAuthor(author, event.getVersion());
                    deploymentAuthors.add(deploymentAuthor);
                    deploymentAuthorBatch.getDeploymentAuthorMap().put(event.getEventStatus(), deploymentAuthors);*/
                });

        if (EventStatus.COMPLETED.equals(event.getEventStatus())) {
            deploymentAuthorBatch.setDeploymentAuthorBatch(new ArrayList<>(pendingAuthorsToBeNotified.values()));

            pendingAuthorsToBeNotified =  new HashMap<>();
        }

    }

}
