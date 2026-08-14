import java.util.ArrayList;
import java.util.Collections;

public class swapAL {
    public static void swap(ArrayList <Integer> list , int INX1 , int INX2){
        //swap 
        int temp = list.get(INX1);
        list.set(INX1, list.get(INX2));
        list.set(INX2, temp);
    }
     public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(15);
        list.add(5);
        list.add(6);
    
        int INX1 = 3 , INX2 = 5;
        System.out.println(list);
        swap(list, INX1, INX2);
        System.out.println(list);
        Collections.sort(list , Collections.reverseOrder());
        System.out.println(list);
    }
}
