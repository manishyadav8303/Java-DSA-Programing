public class sorted_balnce_tree {
   static class Node{
    int data;
    Node left;
    Node right;
         Node(int data ){
            this.data = data;
            this.left = null;
            this.right = null;
         }
   }
   public  static  void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" - >");
        preorder(root.left);
        preorder(root.right);
   }
   public static Node createnode(int arr[] , int st , int end){
    int mid = (st+end)/2;   
    if(st>end){
            return null;
        }
    Node root = new Node(arr[mid]);
    root.left = createnode(arr, st, mid-1);
    root.right = createnode(arr, mid+1, end);
    
    return root;
   }
   public static void main(String[] args) {
    int arr[] = {3,5,6,8,10,11,12};
    Node root = createnode(arr, 0, arr.length-1);
    preorder(root);
   }  
}
