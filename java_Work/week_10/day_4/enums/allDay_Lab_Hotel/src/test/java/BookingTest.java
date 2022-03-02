import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class BookingTest {

        Hotel hotel;
        BedRoom singleRoom;
        BedRoom doubleRoom;
        ConferenceRoom conferenceRoom;
        Guest guest1;
        Guest guest2;
        Guest guest3;
        Booking booking1;


        @Before
        public void before(){
            hotel = new Hotel();
            singleRoom = new BedRoom(1,3,RoomType.SINGLE);
            doubleRoom = new BedRoom(2,77, RoomType.DOUBLE);
            booking1 = new Booking(2,new BedRoom(2, 3, RoomType.DOUBLE));
            conferenceRoom = new ConferenceRoom(2, "The Big Room");
            guest1 = new Guest("Louis");
            guest2 = new Guest("David");
            guest3 = new Guest("Graeme");
            hotel.addBedRoom(singleRoom);
            hotel.addBedRoom(doubleRoom);
            hotel.addConferenceRoom(conferenceRoom);

        }


    @Test
    public void bookedNights(){
        assertEquals(2, booking1.getNights());
    }




}
