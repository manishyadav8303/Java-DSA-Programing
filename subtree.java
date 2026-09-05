public class subtree {
    


    static class Node{
          int data;
        Node left;
        Node right ;
        Node(int data){
            this.data = data;
            this.left=null;
            this.right =null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh)+1;
    }
    public static int diameter(Node root){
        if(root== null){
            return 0;
        }
        int ld = diameter(root.left);
        int lh = height(root.left);
        int rd = diameter(root.right);
        int rh= height(root.right);
        int self = lh+rh+1;

        return Math.max(rd, Math.max(ld, self));
    }

    static class Info{
        int diam ;
        int ht ;
        Info(int diam , int ht){
            this.diam= diam;
            this.ht = ht;
        }
    }
    public static boolean isIdentical(Node root , Node subroot){
        if(root == null && subroot == null){
            return true;
        }else if(root == null || subroot==null || root.data != subroot.data){
            return false;
        }
        if(!isIdentical(root.right, subroot.right)){
            return false;
        }
        if(!isIdentical(root.right, subroot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root , Node subroot){
        if(root == null){
            return false;
        }
        if (root.data == subroot.data){
            if(isIdentical(root , subroot)){
                return true;
            }
        }
        return isSubtree(root.left, subroot)|| isSubtree(root.right, subroot);
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

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);
        System.out.println(isSubtree(root, subroot));

            
        }
    }
    




