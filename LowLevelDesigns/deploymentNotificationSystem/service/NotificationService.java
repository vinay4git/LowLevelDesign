package LowLevelDesigns.deploymentNotificationSystem.service;

import LowLevelDesigns.deploymentNotificationSystem.model.EventStatus;
import LowLevelDesigns.deploymentNotificationSystem.model.Notification;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NotificationService {

    DeploymentAuthorBatch deploymentAuthorBatch;

    public NotificationService() {
        this.deploymentAuthorBatch = DeploymentAuthorBatch.getInstance();
    }


    public List<Notification> sendNotifications() {

        return deploymentAuthorBatch.getDeploymentAuthors().stream().map(deploymentAuthor -> {
            return new Notification(deploymentAuthor.getAuthor(), deploymentAuthor.getVersion());
        }).collect(Collectors.toList());


/*        if (deploymentAuthorBatch.getDeploymentAuthorMap().get(EventStatus.COMPLETED) != null) {
            return deploymentAuthorBatch.getDeploymentAuthorMap().entrySet().stream()
            .filter(eventStatusListEntry -> eventStatusListEntry.getKey().equals(EventStatus.COMPLETED) || eventStatusListEntry.getKey().equals(EventStatus.FAILED))
            .map(eventStatusListEntry -> {
                        return eventStatusListEntry.getValue().stream()
                                .map(deploymentAuthor -> new Notification(deploymentAuthor.getAuthor(), deploymentAuthor.getVersion()))
                                .collect(Collectors.toList());
                    })
            .flatMap(List::stream)
            .collect(Collectors.toList());
        }
        return new ArrayList<>();*/
    }
}
