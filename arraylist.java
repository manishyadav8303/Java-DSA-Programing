import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        list.add(1,15);
      //  list.contains(2);
    //  list.set(1, 10);
        int elemnt =list.get(0);

        System.out.println(list);
        System.out.println(elemnt);
    }
}
