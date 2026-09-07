
import  java.util.*;
public class mindist_btw_twonode {
    public static class Node{
        int data ;
        Node left;
        Node right ;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public  static  Node lca2(Node root , int n1 , int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);
        
        if(leftlca == null){
            return rightlca;
        }
        if(rightlca == null){
            return leftlca;
        }
        return root;
    }
    public  static  int lcadist(Node root , int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftd = lcadist(root.left , n);
        int rightd = lcadist(root.right, n);
        if(leftd == -1 && rightd == -1){
            return -1;
        }else if(leftd == -1 ){
            return  rightd +1;
        }else{
            return leftd +1;
        }

    }
    public  static  int dist(Node root , int n1 , int n2){
        Node lca = lca2(root, n1, n2);
        int leftlcadist = lcadist(lca , n1);
        int rightlcadist = lcadist(lca , n2);
        
        return leftlcadist+rightlcadist;
    }
     
     public static void main(String[] args) {
            /*
                        1
                      /   \
                    2      3
                   / \    / \
                  4   5      6 
            */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
           System.out.println(dist(root, 4, 5)); 

        //   System.out.println(lca2(root, 5, 6).data); 
}
}
