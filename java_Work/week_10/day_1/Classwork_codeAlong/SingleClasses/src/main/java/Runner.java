public class Runner {

    public static void main(String[] args) {
//        Bear bear = new Bear("Balu");
//        bear.setName("Baloo");
//        String name = bear.getName();
//        System.out.println(name);

        Planet mars = new Planet("Mars", 908973);
        System.out.println(mars.getName() + " is " + mars.getSize());
        System.out.println(mars.explode());
    }
}
