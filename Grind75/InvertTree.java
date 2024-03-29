public class InvertTree {

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
    public TreeNode invertTree(TreeNode root) {
        
        if(root==null){
            return null;
        }
        
        if(root.left==null && root.right==null){
            return root;
        }
        //Swap
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        
        //Recurse
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }   
}
