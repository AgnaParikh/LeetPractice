public class MaxDepthBT {

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
    
    //List<Integer> heights;
    
    int max;
    
    public int maxDepth(TreeNode root) {
        
        if(root==null){
            return 0;
        
        }
        
        max=Integer.MIN_VALUE;
        height(root,0);

        return max;       
    }
    
    private void height(TreeNode root,int level){
        
        if(root==null){
            
            if(level>max){
                max=level;
            }
            return;
        }

        height(root.right,level+1);
        height(root.left,level+1);
    }
}
    
}
