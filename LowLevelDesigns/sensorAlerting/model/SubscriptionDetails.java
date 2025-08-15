package LowLevelDesigns.sensorAlerting.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.concurrent.TimeUnit;

@AllArgsConstructor
@Getter
@Builder
public class SubscriptionDetails {
    private TempBasedSubscriptionDetails tempBasedSubscriptionDetails;
    private AvgIntervalBasedSubscriptionDetails avgIntervalBasedSubscriptionDetails;

    @AllArgsConstructor
    @Getter
    @Builder
    public static class TempBasedSubscriptionDetails {
        private Integer ceilingTemp;
        private Integer floorTemp;
    }

    @AllArgsConstructor
    @Getter
    @Builder
    public static class AvgIntervalBasedSubscriptionDetails {
        private Integer averageLimitTemperature;
        private TimeUnit timeUnit;
        private Integer duration;
    }

}
