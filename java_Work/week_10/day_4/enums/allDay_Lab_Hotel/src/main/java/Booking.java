public class Booking {

    protected int nights;
    protected BedRoom bedRoom;

    public Booking(int _nights, BedRoom _bedRoom){
        this.nights = _nights;
        this.bedRoom = _bedRoom;
    }

    public int getNights(){
        return nights;
    }

    public BedRoom getBedRoom(Booking booking){
        return bedRoom;
    }

}
