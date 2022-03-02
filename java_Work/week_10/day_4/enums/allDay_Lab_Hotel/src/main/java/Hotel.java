import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private ArrayList<BedRoom> bedRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedRooms = new ArrayList<BedRoom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();

    }
    public Booking bookRoom(int _nights, BedRoom _bedRoom){
        return new Booking(_nights, _bedRoom);
    }


    public void addBedRoom(BedRoom _bedroom){
        this.bedRooms.add(_bedroom);
    }

    public void addConferenceRoom(ConferenceRoom _conferenceRoom){
        this.conferenceRooms.add(_conferenceRoom);
    }

    public int bedRoomsSize(){
        return this.bedRooms.size();
    }

    public int conferenceRoomsSize(){
        return this.conferenceRooms.size();
    }

}
