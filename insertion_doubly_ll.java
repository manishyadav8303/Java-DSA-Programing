public class insertion_doubly_ll {
    static class Node{

    }
    static void inserion(Node root , int k , Node newNode){
        int count = 0;
        Node head = root;
        while(count < k){
            head = head.next;
            count++;
        }
        int temp = head.next.val;
        newNode.prev = head.val;
        newNode.next = temp;
        head.next.prev = newnode.val;                              
    }
}
