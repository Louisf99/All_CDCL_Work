import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    BedRoom singleRoom;
    BedRoom doubleRoom;
    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;


    @Before
    public void before(){
        hotel = new Hotel();
        singleRoom = new BedRoom(1,3,RoomType.SINGLE);
        doubleRoom = new BedRoom(2,77, RoomType.DOUBLE);
        conferenceRoom = new ConferenceRoom(2, "The Big Room");
        guest1 = new Guest("Louis");
        guest2 = new Guest("David");
        guest3 = new Guest("Graeme");
        hotel.addBedRoom(singleRoom);
        hotel.addBedRoom(doubleRoom);
        hotel.addConferenceRoom(conferenceRoom);
    }

    @Test
    public void canAddBedRoom(){
        assertEquals(2, hotel.bedRoomsSize());
    }

    @Test
    public void canAddConferenceRoom(){
        assertEquals(1, hotel.conferenceRoomsSize());
    }

    @Test
    public void canCheckIntoBedRoom(){
        assertEquals(0, singleRoom.guestsSizeBedroom());
        singleRoom.checkInGuest(guest1);
        singleRoom.checkInGuest(guest2);

        assertEquals(2, singleRoom.guestsSizeBedroom());
    }


    @Test public void canCheckOutOfBedRoom(){
        assertEquals(0, singleRoom.guestsSizeBedroom());
        singleRoom.checkInGuest(guest1);
        singleRoom.checkInGuest(guest2);
        assertEquals(2, singleRoom.guestsSizeBedroom());
        singleRoom.checkOutGuests();
        assertEquals(0, singleRoom.guestsSizeBedroom());
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

    @Test
    public void canBookRoom(){
        assertEquals(Booking.class, hotel.bookRoom(3, singleRoom ).getClass());
    }


}
