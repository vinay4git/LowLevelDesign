package LowLevelDesigns.MeetingRoomBooking;

import java.time.LocalDate;
import java.util.Objects;

public class TimeSlot {
    int startTime;
    int endTime;
    LocalDate date;

    public TimeSlot(int startTime, int endTime, LocalDate date) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TimeSlot timeSlot)) return false;
        return startTime == timeSlot.startTime && endTime == timeSlot.endTime && Objects.equals(date, timeSlot.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, date);
    }
}
