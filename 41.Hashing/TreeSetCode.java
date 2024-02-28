import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetCode {
    
    
     public static void main(String[] args) {
        HashSet<String> Cities = new HashSet<>();
        Cities.add("Delhi");
        Cities.add("Mumbai");
        Cities.add("Noida");
        Cities.add("Bangaluru");

        System.out.println(Cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        // lhs.add("Delhi");
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bangaluru");

        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bangaluru");

        System.out.println(ts);
    }
}
