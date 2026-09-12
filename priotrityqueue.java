import java.util.Comparator;
import java.util.PriorityQueue;

public class priotrityqueue {
    static  class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name , int rank){
            this.name= name;
            this.rank = rank;
        }
        @Override 
        public int compareTo(Student s2){
            return  this.name.compareTo(s2.name);
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A", 5));
        pq.add(new Student("B", 15));
        pq.add(new Student("C", 2));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
        System.out.println();
    }
}
