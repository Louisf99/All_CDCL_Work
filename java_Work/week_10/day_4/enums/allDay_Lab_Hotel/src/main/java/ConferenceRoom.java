public class  ConferenceRoom extends Room {
        private String roomName;

        public ConferenceRoom(int _capacity, String _roomName) {
            super(_capacity);
            this.roomName = _roomName;
        }

        public  int getRoomCapacity() {
            return capacity;
        }

        public String getRoomName(){
            return roomName;
        }

    public int conferenceRoomsGuestsSize(){
        return this.guests.size();
    }

    }
