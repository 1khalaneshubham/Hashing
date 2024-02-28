import java.util.*;

import javax.naming.directory.SearchControls;
 // its not working bahava bcz purn nahi aahe 
public class ImplementationOfHashMap {
    static class  HashMap<k,v> {
        private class Node {
            k key;
            v value;

            public Node(k key,v value){
                this.key = key;
                this.value = value;
            }
        }
        private int n; // n
        private int N;
        private LinkedList<Node> buckets[]; //N

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i =0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(k key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int SearchInll(k key,int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for(int i = 0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBuck = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;
            for(int i = 0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

            // nodes -> add in bucket
            for(int i = 0;  i<oldBuck.length; i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j = 0; j<ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key,node.value);

                }
            }
        }

        public void put( k key , v value){
            int bi = hashFunction(key); // 0 to 3
            int di = SearchInll(key);  // valid: -1

            if(di != -1) {
               return true;
            }else{
                return false;
            }
        }

        public boolean containsKey(k key){
            int bi = hashFunction(key); // 0 to 3
            int di = SearchInll(key);  // valid: -1

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }else{
                buckets[bi].add(new Node(key, value));
                n++;
            }
        }

        public v remove(k key){
            return null;
        }

        public v get(k key){
            return null;
        }

        public ArrayList<k> keySet(){
            return null;
        }
    }    
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);
    }
}
