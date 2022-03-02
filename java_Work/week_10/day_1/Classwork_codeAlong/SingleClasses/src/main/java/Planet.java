public class Planet {

    private String name;
    private int size;
    public Planet(String name, int size ) {
        this.name = name;
        this.size = size;
    }
    public String getName() {
        return this.name;
    }
    public Integer getSize() {
        return this.size;
    }

    public String explode(){
        return("Boom! " + getName() + " has exploded");

    }
}
