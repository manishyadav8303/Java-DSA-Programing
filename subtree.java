import java.util.ArrayList;

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

      /*----------------------------------------------------------------------------------------
                                        LEVEL VALUE
    ----------------------------------------------------------------------------------------*/ 
    
    public static  void levels(Node root , int level , int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data);
            return;
        }
        levels(root.left, level+1, k);
        levels(root.right, level+1, k);
    }

    /*----------------------------------------------------------------------------------------
                                        ANCESTER VALUE
    ----------------------------------------------------------------------------------------*/ 
    public static  boolean isget(Node root , int n , ArrayList<Node> path ){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean leftget = isget(root.left, n, path);
        boolean rightget = isget(root.right, n, path);
        if(leftget || rightget){
            return  true;
        }
        path.remove(path.size()-1);
        return  false;
    }
    public  static  Node ANCESTER(Node root , int n1 , int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        isget(root, n1, path1);
        isget(root, n2, path2);
        int i = 0;
        for( ; i<path1.size() && i< path2.size() ; i++){
            if(path1.get(i) != path2.get(i)){
            break;    
            }
             
        }
        Node lca = path1.get(i-1);
       
        return lca ;
    }
    /*----------------------------------------------------------------------------------------
                                       APPROACH 2 ANCESTER VALUE
    ----------------------------------------------------------------------------------------*/ 
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
 /*----------------------------------------------------------------------------------------
                                       kth ANCESTER VALUE
    ----------------------------------------------------------------------------------------*/ 
    public  static  int kthanc(Node root , int n , int k){
        if(root == null){ return -1; }
        if(root.data == n){ return  0 ;}
        int leftdist = kthanc(root.left, n, k);
        int rightdist = kthanc(root.right, n, k);
        if(leftdist == -1 && rightdist == -1){ return -1 ;}
        int max = Math.max(leftdist, rightdist);
        if(max+1 == k){ System.out.println(root.data);}
        return max+1;

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
       // System.out.println(isSubtree(root, subroot));
       // levels(root, 1, 3);
      // System.out.println(ANCESTER(root, 4, 6).data);
             // System.out.println(lca2(root, 2, 3).data);
             kthanc(root, 5, 2);
     
        }
    }
    




