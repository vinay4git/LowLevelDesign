package LowLevelDesigns.sensorAlerting.service;

import LowLevelDesigns.sensorAlerting.model.Sensor;
import LowLevelDesigns.sensorAlerting.model.SubscriptionDetails;
import LowLevelDesigns.sensorAlerting.model.TempReading;
import LowLevelDesigns.sensorAlerting.model.User;
import LowLevelDesigns.sensorAlerting.model.alert.AlertSubscriptionType;
import LowLevelDesigns.sensorAlerting.model.alert.AlertSubscription;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlertSubscriptionService {
    private Map<Sensor, List<AlertSubscription>> sensorToSubscriptionMap;
    private static final AlertSubscriptionService alertSubscriptionService = new AlertSubscriptionService();

    private AlertSubscriptionService() {
        this.sensorToSubscriptionMap = new HashMap<>();
    }

    public static AlertSubscriptionService getInstance() {
        return alertSubscriptionService;
    }

    List<AlertSubscription> getSubscriptionForSensor(Sensor sensor, List<TempReading> reading) {
        return sensorToSubscriptionMap.get(sensor).stream().filter(alertSubscription -> alertSubscription.alertFilterBasedOnSubscription(reading))
                .toList();
    }

    public void addSubscriptionForUser(Sensor sensor, User user, AlertSubscriptionType alertSubscriptionType, SubscriptionDetails subscriptionDetails) {
        AlertSubscription alertSubscription = AlertSubscriptionFactory.getAlertSubscription(sensor, user, alertSubscriptionType, subscriptionDetails);
        sensorToSubscriptionMap.merge(sensor, new ArrayList<>(List.of(alertSubscription)), (oldList, newList) -> {
            oldList.addAll(newList);
            return oldList;
        });
    }
}
