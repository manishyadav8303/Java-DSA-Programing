import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class hasHmap {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("china", 200);
        map.put("indo", 300);

        System.out.println(map);
        System.out.println(map.get("china"));
        System.out.println(map.containsKey("indo"));
        System.out.println(map.containsKey("la"));
        map.remove("indo");
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        // map.clear();
        // System.out.println(map);
        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("key = "+k +" , value = "+map.get(k));
        }
         

    } 
}
