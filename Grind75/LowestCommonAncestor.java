public class LowestCommonAncestor {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
    
    //O(n) since each node is traversed once atleast
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        
        if(root.val == p.val || root.val == q.val){
            return root;
        }
        
        TreeNode lca1 = lowestCommonAncestor(root.left,p,q);
        TreeNode lca2 = lowestCommonAncestor(root.right,p,q);
        
        //Split
        if(lca1 != null && lca2 != null){
            return root;
        }
        if(lca1 != null){
            return lca1;
        } else{
            return lca2;
        }
    }
    
    //Approach 1: Time complexity O(logn) = height of the tree
    /*public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root==null){
            return root;
        }
        
        if(root.val<p.val && root.val<q.val){
            lowestCommonAncestor(root.right,p,q);
        }
        
        else if(root.val>p.val && root.val>q.val){
            lowestCommonAncestor(root.left,p,q);
        }
        
        return root;
                
    }*/
}
