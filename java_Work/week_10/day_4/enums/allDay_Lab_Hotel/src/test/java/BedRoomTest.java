import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {
    BedRoom bedroom;

    @Before
    public void before(){
        bedroom = new BedRoom(3, 1, RoomType.DOUBLE);
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, bedroom.getRoomCapacity());
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }



}
