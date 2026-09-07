public class transform_sum {
     static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public  static int transform(Node root){
        if(root == null){
            return 0;
        }
        int leftchild = transform(root.left);
        int rightchild = transform(root.right);
        int leftsid = root.left == null ? 0 : root.left.data;
        int rightsid = root.right == null ? 0 : root.right.data;
        int data = root.data;

        root.data = leftsid +leftchild +rightchild+rightsid;
        return data;
    }

    public  static  void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
        
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
    transform(root);
    preorder(root);
    }
}
