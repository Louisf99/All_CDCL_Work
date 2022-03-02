public class Bear {
    private String name;
    private int age;
    private double weight;
    private String name2;


    public Bear(String bearName, int Inputage, double weight) {
        this.name = bearName;
        this.age = Inputage;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean readyToHibernate() {
        if(this.weight >= 80)
        {
            return true;
        }
        return false;
    }
}