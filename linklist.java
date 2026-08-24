import java.util.LinkedList;

public class linklist {
    public static class Node {
        int data ; 
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    public static Node head;
    public static Node tail;
    public static int  size;
    public void addfirst(int data){

        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
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
    public int removefirst(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;

    }
    public int removelast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev  : i= n-2
        Node prev = head;
         while(prev.next != tail){
        prev = prev.next;
         }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size-- ;
        return val;
    }

    public int search(int key){
        Node temp = head;
        int i = 0 ;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1 ;
    }
    public int helper(int key , Node head){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int ind = helper(key, head.next);
        if(ind ==-1){
            return -1;
        }
        return ind+1;
    }
    public int reseach(int key){
        return helper(key, head);
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    public static void main(String[] args) {
       
        linklist ll = new linklist();
      //  ll.print();
        ll.addfirst(1);
       //ll.print();
        ll.addfirst(2);
       // ll.print();
        ll.addlast(3);
       // ll.print();
        ll.addlast(4);
        ll.add(2, 9);
        ll.removefirst();
        ll.print();
        ll.removelast();
        ll.print();
        ll.reverse();
        ll.print();

       System.out.println(ll.reseach(3));
    }
    
}
