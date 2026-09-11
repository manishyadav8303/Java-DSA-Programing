import javax.swing.tree.TreeNode;

public class largest_bst {


    public  static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public  static  class Info{
    boolean isBst;
    int size;
    int min ;
    int max;
    Info(boolean isBst , int size , int min , int max ){
        this.isBst = isBst;
        this.size = size;
        this.min = min;
        this.max =max;
    } 
}
public static  int maxbst = 0;
public  static Info largestBst(Node root){
    if(root == null){
        return  new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    Info leftInfo = largestBst(root.left);
    Info rightInfo = largestBst(root.right);
    int size = leftInfo.size+rightInfo.size+1;
    int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
    int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
    if(root.data <= leftInfo.max ||root.data>= rightInfo.min ){
        return  new Info(false, size, min, max);
    }
    if(leftInfo.isBst && rightInfo.isBst){
        maxbst = Math.max(size, maxbst);
        return new Info(true, size, min, max);
    }
    return  new Info(false, size, min, max);
}
public static void main(String[] args) {
    Node root = new Node(10);

root.left = new Node(5);
root.right = new Node(15);

root.left.left = new Node(1);
root.left.right = new Node(8);

root.right.right = new Node(7);
largestBst(root);
System.out.println(maxbst);
}
}
