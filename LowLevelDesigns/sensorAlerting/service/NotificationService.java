package LowLevelDesigns.sensorAlerting.service;

import LowLevelDesigns.sensorAlerting.model.alert.AlertSubscription;

import java.util.List;

public class NotificationService {

    public static void notifyUser(List<AlertSubscription> alertSubscriptionListToNotify) {
        alertSubscriptionListToNotify.forEach(alertSubscription -> {
            String notificationMessage = alertSubscription.notificationMessage(alertSubscription.getUser().getName());

            System.out.println(notificationMessage);
        });


    }
}
