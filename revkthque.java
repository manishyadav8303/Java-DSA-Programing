import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class revkthque {
    public static Queue reverkth(int k , Queue<Integer> q){
        Stack <Integer> s = new Stack<>();
        int size = q.size();
        //Queue <Integer> q1 = new LinkedList<>();
        int i = 0;
        while(i<k){
            s.push(q.remove());
            i++;
        }
        // while(!s.isEmpty()){
        //     q1.add(s.pop());
        // }
        // while(!q.isEmpty()){
        //     q1.add(q.remove());
        // }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        while(i<size){
            q.add(q.remove());
            i++;
        }
        return q;

    }
}
