package LowLevelDesigns.sensorAlerting.service;

import LowLevelDesigns.sensorAlerting.model.Sensor;
import LowLevelDesigns.sensorAlerting.model.TempReading;
import LowLevelDesigns.sensorAlerting.model.alert.AlertSubscription;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SensorReadingService {

    private final Map<Sensor, List<TempReading>> sensorPastReading;
    private final AlertSubscriptionService alertSubscriptionService;
    private static SensorReadingService sensorReadingService;

    private SensorReadingService(AlertSubscriptionService alertSubscriptionService) {
        this.alertSubscriptionService = alertSubscriptionService;
        sensorPastReading = new HashMap<>();
    }

    public static SensorReadingService getInstance(AlertSubscriptionService alertSubscriptionService) {
        if (sensorReadingService == null)
            sensorReadingService = new SensorReadingService(alertSubscriptionService);
        return sensorReadingService;
    }

    public void readingReceived(Sensor sensor, Integer temperature) {
        updateSensorReading(sensor, temperature);

        List<AlertSubscription> subscriptionForSensor = alertSubscriptionService
                .getSubscriptionForSensor(sensor, sensorPastReading.get(sensor));

        NotificationService.notifyUser(subscriptionForSensor);
    }

    public void updateSensorReading(Sensor sensor, Integer currentTemperature) {
        sensorPastReading.computeIfAbsent(sensor, s -> new ArrayList<>()).add(new TempReading(currentTemperature, System.currentTimeMillis()));
    }
}
