import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class insert_heap {
        static class Heap{
            ArrayList<Integer> arr = new ArrayList<>();
            public  void  add(int data){
                arr.add(data);
            
            int x = arr.size()-1;
            int par = (x-1)/2;
            while(arr.get(x)<arr.get(par)){
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par , temp);
                x = par;
                par = (x+1)/2;
             }
        }
        public  int peek(){
            return  arr.get(0);
        }
        private void heapify(int i ){
                int left = 2*i+1;
                int right = 2*i+1;
                int minIdx = i;

                if(left<arr.size() && arr.get(minIdx)>arr.get(left)){
                    minIdx = left;
                }

                if(right<arr.size() && arr.get(minIdx)>arr.get(right)){
                    minIdx = right;
                }
                if(minIdx != i){
                    //swap
                    int temp = arr.get(i);
                    arr.set(i , arr.get(minIdx));
                    arr.set(minIdx, temp);

                    heapify(minIdx);
                }
        }


        public  int remove(){
            int data = arr.get(0);
            // swap
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            //delete alst node 
            arr.remove(arr.size()-1);

            // heapify
            heapify(0);
            return  data;
        }
    } 

    public static void main(String[] args) {
         PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add( 5);
        pq.add( 15);
        pq.add( 2);
        pq.add(1);
        pq.remove(1);
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
        System.out.println();
    }
}

