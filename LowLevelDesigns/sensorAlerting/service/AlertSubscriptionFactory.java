package LowLevelDesigns.sensorAlerting.service;

import LowLevelDesigns.sensorAlerting.model.Sensor;
import LowLevelDesigns.sensorAlerting.model.SubscriptionDetails;
import LowLevelDesigns.sensorAlerting.model.User;
import LowLevelDesigns.sensorAlerting.model.alert.AlertSubscription;
import LowLevelDesigns.sensorAlerting.model.alert.AlertSubscriptionType;
import LowLevelDesigns.sensorAlerting.model.alert.IntervalBasedAlertSubscription;
import LowLevelDesigns.sensorAlerting.model.alert.TempBasedAlertSubscription;
import lombok.Getter;

@Getter

public class AlertSubscriptionFactory {
    public static AlertSubscription getAlertSubscription(Sensor sensor, User user, AlertSubscriptionType alertSubscriptionType, SubscriptionDetails subscriptionDetails) {
        if (AlertSubscriptionType.INTERVAL_BASED.equals(alertSubscriptionType)) {
            return IntervalBasedAlertSubscription.builder()
                    .sensor(sensor)
                    .user(user)
                    .averageLimitTemperature(subscriptionDetails.getAvgIntervalBasedSubscriptionDetails().getAverageLimitTemperature())
                    .timeUnit(subscriptionDetails.getAvgIntervalBasedSubscriptionDetails().getTimeUnit())
                    .duration(subscriptionDetails.getAvgIntervalBasedSubscriptionDetails().getDuration())
                    .build();
        } else if (AlertSubscriptionType.TEMP_BASED.equals(alertSubscriptionType)) {
            return TempBasedAlertSubscription.builder()
                    .sensor(sensor)
                    .user(user)
                    .lowerTemp(subscriptionDetails.getTempBasedSubscriptionDetails().getFloorTemp())
                    .higherTemp(subscriptionDetails.getTempBasedSubscriptionDetails().getCeilingTemp())
                    .build();
        }

        return null;
    }
}
