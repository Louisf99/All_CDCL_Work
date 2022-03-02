import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> favouriteFruits= new HashMap();

        favouriteFruits.put("Alice", "Apple");
        favouriteFruits.put("Sarah", "Banana");
        favouriteFruits.put("Bob", "Strawberry");

        favouriteFruits.get("Alice"); // Apple

    }
}
//hashmap is the same as a dictionary from python it contains key value pairs but you have to set it up and declare what data type the key and the value will be and in this case both are string