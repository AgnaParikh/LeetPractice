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
class sumOfLeftLeaves {
    
    int sum=0;
    
    public int sumOfLeftLeaves(TreeNode root) {
        
        int left=0;
        int right=0;

        if(root==null){
            return 0;
        }
        
        //left leaf node
        if(root.left!=null && root.left.right==null && root.left.left==null){
            //return root.left.val;
            sum=sum+root.left.val;
        }
        
        if(root.left!=null){
            sumOfLeftLeaves(root.left);
        }
        
        if(root.right!=null){
            sumOfLeftLeaves(root.right);
        }
        
        return sum;
    }

    /**
     *  public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root,false);
    }
    
    public int sumOfLeftLeaves(TreeNode node, boolean isLeft){
        int sum = 0;
        if(node == null)
            return 0;
        if(isLeft && node.left == null && node.right == null)
            sum += node.val;
        sum += sumOfLeftLeaves(node.left, true) + sumOfLeftLeaves(node.right, false);
        return sum;
    }
     */
}