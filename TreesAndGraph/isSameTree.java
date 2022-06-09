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
class isSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        /**
        O(n): as it iterates all the nodes
        **/
        
        if((p==null && q!=null) || (p!=null && q==null)){
            return false;
        }
        
        if(p==null && q==null){
            return true;
        }
        
        if(p.val!=q.val){
            return false;
        }
        
        return isSameTree(p.right,q.right) && isSameTree(p.left,q.left);
        
    }
}
