package LowLevelDesigns.sensorAlerting.model;

import lombok.Getter;

@Getter
public class TempReading {
    Integer temperature;
    Long timestamp;

    public TempReading(Integer temperature, Long timestamp) {
        this.temperature = temperature;
        this.timestamp = timestamp;
    }

}
