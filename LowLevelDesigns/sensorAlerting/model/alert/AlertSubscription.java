package LowLevelDesigns.sensorAlerting.model.alert;

import LowLevelDesigns.sensorAlerting.model.Sensor;
import LowLevelDesigns.sensorAlerting.model.TempReading;
import LowLevelDesigns.sensorAlerting.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public abstract class AlertSubscription {
    Sensor sensor;
    User user;

    public abstract Boolean alertFilterBasedOnSubscription(List<TempReading> readings);
    public abstract String notificationMessage(String userName);
}
