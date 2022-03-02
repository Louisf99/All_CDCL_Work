import java.util.ArrayList;

public abstract class Room {

    protected int capacity;
    protected ArrayList<Guest> guests;


    public Room(int _capacity) {
        this.capacity = _capacity;
        this.guests = new ArrayList<>();
    }

    public void checkInGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void checkOutGuests() {
        this.guests.clear();
    }


}



