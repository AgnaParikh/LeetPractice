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

//Minimum Depth of Binary Tree
class minDepth {
    
    HashSet<Integer> ans=new HashSet<>();
    
    public int minDepth(TreeNode root) {
        
        if(root==null){
            return 0;
        }
        
        return minDepth(root,0);
        
    }
    
    private int minDepth(TreeNode root, int depth){
        
        if(root==null){
            return 0;
        }
        
        if(root.left==null && root.right==null){
                ans.add(depth+1);
                System.out.println(ans.toString());        
                return depth+1;
        }
        
        minDepth(root.left,depth+1);
        minDepth(root.right,depth+1);
        
        return Collections.min(ans);
    }

    /**
     * public int minDepth(TreeNode root) {

    int ans = solve(root);
    
   return ans==Integer.MAX_VALUE?0:ans; //  edge case

    }

    public int solve(TreeNode root){
        
        if (root==null){   // if null so return Integer.MAX_VALUE So it doesnot interfere with other calls 
            return Integer.MAX_VALUE;
        }

        if(root.left == null && root.right == null) return 1;  // if leaf node return 1;
        
        int left = solve(root.left);  
        int right = solve(root.right);
        
        return Math.min(left,right)+1; 
        }
        */
}