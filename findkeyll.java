import java.util.LinkedList;
public class findkeyll {
     public static class Node {
        int data ; 
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    public static Node head;
    public static int size;
    public int search(int key){
        int i = 0 ;
        Node temp = head;
        while (temp!=null) {
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1 ;
    }
    public void add(int index , int data){
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i<index-1) {
            newNode.next = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print(){
        if(head== null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        linklist ll = new linklist();
        ll.add(0, 1);
        ll.print();
    }
}
