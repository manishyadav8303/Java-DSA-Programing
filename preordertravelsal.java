import org.w3c.dom.Node;

public class preordertravelsal {
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
    static class BinaryTree{
        static int index = -1;
        public static Node builtbinarytree(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node newnode = new Node(nodes[index]);
            newnode.left = builtbinarytree(nodes);
            newnode.right = builtbinarytree(nodes);
            return newnode;
        }
        
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null ){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
        
    }
    public static void postorder(Node root ){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.builtbinarytree(nodes);
        preorder(root);
        // inorder(root);
        //postorder(root);

        
    }
}
