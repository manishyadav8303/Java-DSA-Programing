import java.util.LinkedList;
public class llframework {
    public static void main(String[] args) {
        LinkedList <Integer> ll = new LinkedList<>();
        ll.add(1);
        System.out.println(ll);
        ll.add(2);
         System.out.println(ll);
        ll.addFirst(3);
         System.out.println(ll);
        ll.removeLast();
         System.out.println(ll);
    }
}
