import java.util.ArrayList;


public class Bear {
    private String name;
    private ArrayList<Salmon> belly;


    public Bear(String bearName) {
        this.name = bearName;
        this.belly = new ArrayList<>();
    }


    public int foodCount(){
        return belly.size();
    }


    public void eat(Salmon salmon) {
        belly.add(salmon);
    }


    public void sleep() {
        belly.clear();
    }


    public void eatFromRiver(River river){
        Salmon salmon = river.removeFish();
        belly.add(salmon);
    }
}

