import java.util.*;

public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> Cities = new HashSet<>();
        Cities.add("Delhi");
        Cities.add("Mumbai");
        Cities.add("Noida");
        Cities.add("Bangaluru");

        // Iterator it = Cities.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        for(String city : Cities ) {
            System.out.println(city);
        }
    }    
}
