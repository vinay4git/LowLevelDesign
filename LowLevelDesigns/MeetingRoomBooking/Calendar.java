package LowLevelDesigns.MeetingRoomBooking;

import java.time.LocalDate;
import java.util.*;

public class Calendar {
    //List<TimeSlot> timeSlotList;
    Map<TimeSlot, Meeting> meetingMap;

    public Calendar() {
        //timeSlotList = new ArrayList<>();
        meetingMap = new HashMap<>();

        for (int i = 0; i < 24; i++) {
            meetingMap.put(new TimeSlot(i, i+1, LocalDate.now()), null);
            //timeSlotList.add();
        }
    }

    public boolean isCalendarAvailable(TimeSlot timeSlot) {
        return Objects.isNull(meetingMap.get(timeSlot));
    }

    public synchronized boolean bookCalendar(Meeting meeting){
        if(Objects.isNull(meetingMap.get(meeting.timeSlot))) {
            meetingMap.put(meeting.timeSlot, meeting);
            return true;
        } else {
            return  false;
        }
    }
}
