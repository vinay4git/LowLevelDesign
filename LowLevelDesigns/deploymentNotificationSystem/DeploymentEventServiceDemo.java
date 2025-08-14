package LowLevelDesigns.deploymentNotificationSystem;

import LowLevelDesigns.deploymentNotificationSystem.model.Author;
import LowLevelDesigns.deploymentNotificationSystem.model.Event;
import LowLevelDesigns.deploymentNotificationSystem.model.EventStatus;
import LowLevelDesigns.deploymentNotificationSystem.model.Notification;
import LowLevelDesigns.deploymentNotificationSystem.service.EventService;
import LowLevelDesigns.deploymentNotificationSystem.service.NotificationService;

import java.util.List;

public class DeploymentEventServiceDemo {
    public static void main(String[] args) {
        Author soner = new Author("soner", "soner@email.com");

        Event event = new Event(List.of(soner), 101, EventStatus.STARTED);

        EventService eventService = new EventService();

        eventService.handleEvent(event);


        Author vinay = new Author("vinay", "vinay@email.com");
        Event eventSuccess = new Event(List.of(vinay), 102, EventStatus.COMPLETED);

        eventService.handleEvent(eventSuccess);

        NotificationService notificationService = new NotificationService();

        List<Notification> notifications = notificationService.sendNotifications();

        notifications.stream().forEach(notification -> {
            System.out.println("Notification triggered for " + notification.getAuthor().getName() + " as deployment succeeded for Version " + notification.getVersion());
        });

    }
}
