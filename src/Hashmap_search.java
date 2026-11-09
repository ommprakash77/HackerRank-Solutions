

import java.util.*;
public class Hashmap_search {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("us", 50);
        map.put("china", 150);
        System.out.println(map);

        map.put("china", 200);
        System.out.println(map);

        if (map.containsKey("china")) {
            System.out.println("key is present in the map");
        } else {
            System.out.println("key iis not present n the map");
        }
      for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            Set<String>key=map.keySet();
            for(String keys:key){

                System.out.println(key+" "+map);
            }
        }
    }
}


