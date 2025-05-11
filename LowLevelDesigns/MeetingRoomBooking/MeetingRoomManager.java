package LowLevelDesigns.MeetingRoomBooking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MeetingRoomManager {
    List<MeetingRoom> roomList = new ArrayList<>();
    Map<MeetingRoom, Calendar> bookedRoomMap = new HashMap<>();
    static MeetingRoomManager meetingRoomManager = new MeetingRoomManager();

    private MeetingRoomManager() {
    }

    public static MeetingRoomManager getMeetingRoomManagerInstance() {
        return  meetingRoomManager;
    }

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        roomList.add(meetingRoom);
        bookedRoomMap.put(meetingRoom, new Calendar());
    }

    public List<MeetingRoom> getAvailableRooms(TimeSlot timeSlot, int capacity) {
        return bookedRoomMap.entrySet().stream()
                .filter(meetingRoomCalendarEntry -> meetingRoomCalendarEntry.getKey().capacity >= capacity)
                .filter(meetingRoomCalendarEntry -> meetingRoomCalendarEntry.getValue().isCalendarAvailable(timeSlot))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public boolean bookMeeting(Meeting meeting){
        return bookedRoomMap.get(meeting.getMeetingRoom()).bookCalendar(meeting);
    }

}
