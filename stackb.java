import java.util.ArrayList;
import java.util.Stack;

public class stackb {
    static class Node{
        int data;
        Node next ;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class stack{
        static Node head = null;
        public static boolean isempty(){
            return head== null;
        }
        public static void pushll(int data){
            Node newnode = new Node(data);
            if(isempty()){
                head = newnode;
                return;
            }else{
                newnode.next = head;
                head = newnode;
            }

        }

        public static   int popll(){
            if(isempty()){
                return -1;
            }else{
                int top = head.data;
                head = head.next;
                return top;
            }
        }

        static ArrayList <Integer> list = new ArrayList<>();
        public static boolean empty(){
            return list.size() == 0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peak(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.empty()){
        System.out.println(s.peak());
        s.pop();
        }
    }
}
