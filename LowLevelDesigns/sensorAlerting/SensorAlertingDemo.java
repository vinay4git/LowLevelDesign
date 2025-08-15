package LowLevelDesigns.sensorAlerting;

import LowLevelDesigns.sensorAlerting.model.Sensor;
import LowLevelDesigns.sensorAlerting.model.SubscriptionDetails;
import LowLevelDesigns.sensorAlerting.model.User;
import LowLevelDesigns.sensorAlerting.model.alert.AlertSubscriptionType;
import LowLevelDesigns.sensorAlerting.service.AlertSubscriptionService;
import LowLevelDesigns.sensorAlerting.service.SensorReadingService;

import java.util.concurrent.TimeUnit;

public class SensorAlertingDemo {
    public static void main(String[] args) throws InterruptedException {
        User vinay = new User("vinay", "1234");
        User gayathri = new User("gayathri", "43224");

        Sensor hyderabad = new Sensor("312432", "Hyderabad");
        Sensor bangalore = new Sensor("2343242", "Bangalore");

        AlertSubscriptionService alertSubscriptionService  = AlertSubscriptionService.getInstance();
        SensorReadingService sensorReadingService = SensorReadingService.getInstance(alertSubscriptionService);

        SubscriptionDetails vinayTempBasedSubscriptionDetails = SubscriptionDetails.builder().tempBasedSubscriptionDetails(
                SubscriptionDetails.TempBasedSubscriptionDetails.builder()
                        .ceilingTemp(80)
                        .floorTemp(40)
                        .build()
        ).build();
        alertSubscriptionService.addSubscriptionForUser(hyderabad, vinay, AlertSubscriptionType.TEMP_BASED, vinayTempBasedSubscriptionDetails);
        sensorReadingService.readingReceived(hyderabad, 30);

        SubscriptionDetails gayathriIntervalBasedSubscriptionDetails = SubscriptionDetails.builder().avgIntervalBasedSubscriptionDetails(
                SubscriptionDetails.AvgIntervalBasedSubscriptionDetails.builder()
                        .averageLimitTemperature(20)
                        .timeUnit(TimeUnit.SECONDS)
                        .duration(10)
                        .build()
        ).build();
        alertSubscriptionService.addSubscriptionForUser(bangalore, gayathri, AlertSubscriptionType.INTERVAL_BASED, gayathriIntervalBasedSubscriptionDetails);
        sensorReadingService.readingReceived(bangalore, 50);
        sensorReadingService.readingReceived(bangalore, 10);
        Thread.sleep(11 * 1000);
        sensorReadingService.readingReceived(bangalore, 10);


    }
}
