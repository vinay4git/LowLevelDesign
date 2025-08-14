package LowLevelDesigns.deploymentNotificationSystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Notification {
    Author author;
    Integer version;
}
