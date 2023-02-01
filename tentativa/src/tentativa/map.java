package tentativa;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        // Retrieve a value by its key
        int bananaValue = map.get("banana");
        System.out.println(bananaValue); // Output: 2

        // Check if a key is in the map
        boolean hasCherry = map.containsKey("cherry");
        System.out.println(hasCherry); // Output: true

        // Remove a key-value pair from the map
        map.remove("cherry");
//        boolean hasCherry = map.containsKey("cherry");
//        System.out.println(hasCherry); // Output: false

        //Iterating over key-value pair
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}