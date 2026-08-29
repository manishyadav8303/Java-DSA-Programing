import java.util.LinkedList;
import java.util.Queue;

public class interleave {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q1 = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        int size = q.size();
        int count = 0;
        int half = size/2;
        while (count<half) {
            q1.add(q.remove());
            count ++;
        }
        while(!q1.isEmpty()){
            q.add(q1.remove());
            q.add(q.remove());
        }
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
        }
}
