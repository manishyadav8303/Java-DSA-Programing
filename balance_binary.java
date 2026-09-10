import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class balance_binary {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
    public TreeNode balanceBST(TreeNode root) {
        // inorder
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root , ans);
        // sorted bst
        root = balancebst(ans , 0 , ans.size()-1);
        return root;
    }
    public static void inorder(TreeNode root , ArrayList<Integer> ans){
        if(root == null){
            return ;
        }
        inorder(root.left , ans);
        ans.add(root.val);
        inorder(root.right , ans);
    }
    public static TreeNode balancebst(ArrayList<Integer> ans, int st , int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        TreeNode root= new TreeNode(ans.get(mid));
        root.left = balancebst(ans , st , mid-1);
        root.right = balancebst(ans , mid+1 , end);
        return root;
    }
}

