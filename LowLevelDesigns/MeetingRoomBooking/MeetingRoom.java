package LowLevelDesigns.MeetingRoomBooking;

public class MeetingRoom {
    int capacity;
    String name;
    String location;

    public MeetingRoom(int capacity, String name, String location) {
        this.capacity = capacity;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "MeetingRoom{" +
                "capacity=" + capacity +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
