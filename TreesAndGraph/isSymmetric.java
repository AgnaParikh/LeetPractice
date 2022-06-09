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
class isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        
        //Base case 1
        if(root==null){
            return true;
        }
        
        return isSymmetric(root,root);
        
    }
    
    private boolean isSymmetric(TreeNode p,TreeNode q){
        
        if((p==null && q!=null) || (p!=null && q==null)){
            return false;
        }
        
        if(p==null && q==null){
            return true;
        }
        
        if(p.val!=q.val){
            return false;
        }
        
        return isSymmetric(p.left,q.right) && isSymmetric(p.right,q.left);
    }
}