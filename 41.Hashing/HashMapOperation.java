import java.util.HashMap;

public class HashMapOperation{
    public static void main(String[] args) {
        // create
        HashMap<String,Integer> hm = new HashMap<>();
        
        // Insert -O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // print size
        System.out.println(hm.size());

        // Is Empty
        System.err.println(hm.isEmpty());  // false

        // Get - O(1)
        int population = hm.get("India");
        System.out.println(population); // 100

        System.out.println(hm.get("Indonesia")); // null

        // containsKey - O(1)
        System.out.println(hm.containsKey("India"));  // true
        System.out.println(hm.containsKey("Indonesia"));  // false

        // Remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);


        hm.clear(); // data clear kart bahava

        System.out.println(hm);
        
        System.err.println(hm.isEmpty());

    }
}