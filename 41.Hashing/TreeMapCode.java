import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapCode {
 
      public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>(); // order madhe yeta bahi
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);

        HashMap<String,Integer> hm = new HashMap<>(); // order madhe nahi yet bahi
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        
        System.out.println(tm);
        System.out.println(hm);

    }
}
