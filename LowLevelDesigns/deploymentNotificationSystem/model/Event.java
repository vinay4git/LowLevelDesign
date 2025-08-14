package LowLevelDesigns.deploymentNotificationSystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Event {

    List<Author> authors;
    Integer version;
    EventStatus eventStatus;
}
