import java.util.LinkedList;
//import findkeyll.Node;

import org.w3c.dom.Node;


public class mergell {
    // public static class Node {
    // int data;
    // Node next;

    // public Node(int data) {
    //     this.data = data;
    //     this.next = null;
    // }
}
    private static Node getmid(Node head){
        Node fast = head.next;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    } 
    private static Node merge(Node left , Node right){ 
         Node mergedll = new Node(-1);
         Node temp = mergedll;
         while (left != null && right != null) {
            if(left.data <= right.data){
                temp.next = left;
                left = left.next;
                temp = temp.next; 
            }else{
                temp.next = right;
                right = right.next;
                 temp = temp.next;
            }
         }
         while(left!=null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
         }

         while (right!=null) {
            temp.next = right;
            right = right.next;
            temp = temp.next; 
            
         }
         return mergedll.next;
    }
   
    public static Node mergesor(Node head){
        //base
        if(head == null || head.next == null){
            return head; 
        }
    //find mid
    Node mid = getmid(head);
    // left half and right half
    Node righthead = mid.next;
    mid.next = null;
    Node left = mergesor(head);
    Node right = mergesor(righthead);
    // merge
    return merge(left , right);
    }
    //  public void print(){
    //     if(head== null){
    //         System.out.println("ll is empty");
    //         return;
    //     }
    //     Node temp = head;
    //     while(temp != null){
    //         System.out.print(temp.data + "-->");
    //         temp = temp.next;
    //     }
    //     System.out.println("null");
    // }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        System.out.println(ll);
       // ll.head = ll.mergesor(ll.head);
      
    }
}
