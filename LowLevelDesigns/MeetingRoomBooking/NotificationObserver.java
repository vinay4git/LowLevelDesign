package LowLevelDesigns.MeetingRoomBooking;

public class NotificationObserver {

    Meeting meeting;

    public NotificationObserver(Meeting meeting) {
        this.meeting = meeting;
    }

    public void sendEmailNotification() {
        meeting.getAttendees().forEach(user -> {
            System.out.println("Invite for meeting: " + meeting.getMeetingSubject() + " sent to " + user.emailId);
        });

    }
}
