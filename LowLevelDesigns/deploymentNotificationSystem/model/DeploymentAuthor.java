package LowLevelDesigns.deploymentNotificationSystem.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
public class DeploymentAuthor {
    Author author;
    Integer version;
}
