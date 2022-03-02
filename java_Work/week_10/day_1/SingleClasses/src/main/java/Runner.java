public class Runner {
    public static void main(String[] args) {
        Bear bear = new Bear("Baloo");
        System.out.println(bear.getName());
        bear.setName("Baloo");
        System.out.println(bear.getName());

    }
}
