import org.w3c.dom.Node;

public class preordertree {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binarytree {

        static int indx = -1;

        public static Node builtTree(int nodes[]) {

            indx++;

            if (nodes[indx] == -1) {
                return null;
            }

            Node newnNode = new Node(nodes[indx]);

            newnNode.left = builtTree(nodes);

            newnNode.right = builtTree(nodes);
            //int root = newnNode;

            return newnNode;
        }
    }
    // public static void preorder(int[] nodes){
    //     if(root = null){
    //         return ;
    //     }
    //     System.out.println(root.data + " ");
    //     preorder(root.left);
    //     preorder(root.right);
    // }

    public static void main(String[] args) {

   int nodes[] = {1, 2, 4, -1, -1, -1, -1};

        binarytree tree = new binarytree();

        Node root = tree.builtTree(nodes);
       // preorder(nodes);

        System.out.println(root.data);
    }
}