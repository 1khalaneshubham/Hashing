import java.util.*;

public class LinkedHashMapCode {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>(); // order madhe yeta bahi
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        HashMap<String,Integer> hm = new HashMap<>(); // order madhe nahi yet bahi
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        
        System.out.println(lhm);
        System.out.println(hm);

    }
}
