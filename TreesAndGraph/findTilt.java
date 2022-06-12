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
class findTilt {
    
    /**
    , in order to calculate the tilt value for a node, we need to calculate the sum of its left and right subtrees respectively.
    **/
    public int findTilt(TreeNode root) {
        
        int left=0,right=0;
        
        if(root==null){
            return 0;
        }
        
        left=sum(root.left);
        right=sum(root.right);
        
        root.val=(Math.abs(right-left));
        
        return findTilt(root.left)+findTilt(root.right)+root.val;
        
        
    }
    
    private int sum(TreeNode root){
        int left=0;
        int right=0;
        
        if(root==null){
            //System.out.println("Here");
            return 0;
        }
        
        //sum(root.left)+root.val;
        //sum(root.right)+root.val;
        
        return sum(root.left)+sum(root.right)+root.val; 
        
    }
}