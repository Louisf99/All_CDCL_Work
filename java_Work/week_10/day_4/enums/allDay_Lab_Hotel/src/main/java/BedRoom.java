import java.util.ArrayList;

public class BedRoom extends Room {
    private int roomNumber;
    private RoomType roomType;


    public BedRoom(int _capacity, int _roomNumber, RoomType roomType) {
        super(_capacity);
        this.roomNumber = _roomNumber;
        this.roomType = roomType;
    }


    public int getRoomCapacity() {
        return capacity;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int guestsSizeBedroom(){
        return this.guests.size();
    }

}

