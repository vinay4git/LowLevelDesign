package LowLevelDesigns.sensorAlerting.model.alert;

import LowLevelDesigns.sensorAlerting.model.TempReading;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
public class TempBasedAlertSubscription extends AlertSubscription {
    Integer lowerTemp;
    Integer higherTemp;

    @Override
    public Boolean alertFilterBasedOnSubscription(List<TempReading> readings) {
        return readings.getLast().getTemperature() > higherTemp
                || readings.getLast().getTemperature() < lowerTemp;
    }

    @Override
    public String notificationMessage(String userName) {
        return "Temperature Based Alert triggered for user: " + userName + " as the current temperature is outside the subscribed range " + lowerTemp + "-" + higherTemp;
    }
}
