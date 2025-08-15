package LowLevelDesigns.sensorAlerting.model.alert;

import LowLevelDesigns.sensorAlerting.model.TempReading;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.OptionalDouble;
import java.util.concurrent.TimeUnit;

@Getter
@SuperBuilder
public class IntervalBasedAlertSubscription extends AlertSubscription {
    Integer averageLimitTemperature;
    TimeUnit timeUnit;
    Integer duration;

    @Override
    public Boolean alertFilterBasedOnSubscription(List<TempReading> readings) {
        OptionalDouble averageTemp = readings.stream()
                .filter(tempReading -> {
                    return tempReading.getTimestamp() > (System.currentTimeMillis() - (timeUnit.toMillis(duration)));
                })
                .map(TempReading::getTemperature)
                .mapToInt(x -> x).average();
        return averageTemp.isPresent() && averageTemp.getAsDouble() >= averageLimitTemperature;
    }

    @Override
    public String notificationMessage(String userName) {
        return "Interval Based Alert triggered for user: " + userName + " as the average reading crossed " + averageLimitTemperature + " for last " + duration  + " " + timeUnit.name();
    }
}
