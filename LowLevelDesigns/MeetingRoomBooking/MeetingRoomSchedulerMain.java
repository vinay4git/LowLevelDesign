package LowLevelDesigns.MeetingRoomBooking;

import java.time.LocalDate;
import java.util.List;

public class MeetingRoomSchedulerMain {
    public static void main(String[] args) {
        MeetingRoomManager meetingRoomManagerInstance = MeetingRoomManager.getMeetingRoomManagerInstance();
        Meeting draftMeeting = new Meeting();

        User organizer = new User("Vinay", "bvk@gmail.com");
        draftMeeting.setOrganizer(organizer);

        draftMeeting.setMeetingSubject("Improve the caliber meeting");
        draftMeeting.setAttendees(List.of(new User("Gayathri", "g.y08@gmail.com")));

        draftMeeting.setTimeSlot(new TimeSlot(1,2, LocalDate.now()));
        meetingRoomManagerInstance.addMeetingRoom(new MeetingRoom(2,"pondi","4th Floor"));
        meetingRoomManagerInstance.addMeetingRoom(new MeetingRoom(2,"Goa","4th Floor"));

        List<MeetingRoom> availableRooms = meetingRoomManagerInstance.getAvailableRooms(draftMeeting.getTimeSlot(), draftMeeting.getAttendees().size() + 1);

        System.out.println(availableRooms);

        draftMeeting.setMeetingRoom(availableRooms.get(0));
        boolean b = meetingRoomManagerInstance.bookMeeting(draftMeeting);

        if (b){
            NotificationObserver notificationObserver = new NotificationObserver(draftMeeting);
            notificationObserver.sendEmailNotification();
        }


        List<MeetingRoom> availableRooms2 = meetingRoomManagerInstance.getAvailableRooms(draftMeeting.getTimeSlot(), 2);

        System.out.println(availableRooms2);
    }
}
