import java.util.*;

public class HaseSetCode {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);
        
        System.out.println(set);

        // set.remove(2);
        System.out.println("Data aahe ka :"+set.isEmpty());

        if(set.contains(2)){
            System.out.println("set contains 2");
            System.out.println("set Size: "+set.size());
        }
        // if(set.contains(3)){
        //     System.out.println("set contains 3");
        // }
        set.clear();
        System.out.println(set.size());
        System.out.println("Data aahe ka: "+set.isEmpty());
    }
}
