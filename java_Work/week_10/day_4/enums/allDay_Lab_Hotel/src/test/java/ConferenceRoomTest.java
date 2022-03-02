import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Hotel hotel;
    BedRoom singleRoom;
    BedRoom doubleRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;


    @Before
    public void before(){
        hotel = new Hotel();
        singleRoom = new BedRoom(1,3,RoomType.SINGLE);
        doubleRoom = new BedRoom(3,77, RoomType.DOUBLE);
        conferenceRoom = new ConferenceRoom(2, "Presidential");
        guest1 = new Guest("Louis");
        guest2 = new Guest("David");
        guest3 = new Guest("Graeme");
        hotel.addBedRoom(singleRoom);
        hotel.addBedRoom(doubleRoom);
        hotel.addConferenceRoom(conferenceRoom);
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, conferenceRoom.getRoomCapacity());
    }

    @Test
    public void hasRoomName(){
        assertEquals("Presidential", conferenceRoom.getRoomName());
    }

    @Test
    public void canCheckIntoConferenceRoom(){
        assertEquals(0, conferenceRoom.conferenceRoomsGuestsSize());
        conferenceRoom.checkInGuest(guest2);
        assertEquals(1, conferenceRoom.conferenceRoomsGuestsSize());
    }

    @Test public void canCheckOutOfConferenceRoom(){
        assertEquals(0, conferenceRoom.conferenceRoomsGuestsSize());
        conferenceRoom.checkInGuest(guest1);
        assertEquals(1, conferenceRoom.conferenceRoomsGuestsSize());
        conferenceRoom.checkOutGuests();
        assertEquals(0, conferenceRoom.conferenceRoomsGuestsSize());
    }
}

