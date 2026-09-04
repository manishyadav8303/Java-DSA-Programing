

public class diameter {
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
      public static Info diam(Node root) {

        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diam(root.left);
        Info rightInfo = diam(root.right);

        // Diameter passing through current node
        int selfDiam = leftInfo.ht + rightInfo.ht + 1;

        // Maximum diameter
        int diam = Math.max(
                selfDiam,
                Math.max(leftInfo.diam, rightInfo.diam)
        );

        // Height
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
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
            System.out.println(diam(root).ht);
        }
    }
    


