public class BTLevelOrderTraversal {
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
    
    List<List<Integer>> ans;
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        ans=new ArrayList<>();
        
        if(root==null){
            //ans.add(new ArrayList<Integer>());
            return ans;
        }       
        
        levelOrder(root,0);
        
        return ans;
    }
    
    private void levelOrder(TreeNode root,int level){
        
        List<Integer> curr=null;
        
        if(root==null){
            return;
        }
        
        if(ans.size()==level){
            ans.add(new ArrayList<Integer>());
        }
        
        curr=ans.get(level);
        curr.add(root.val);
        
        levelOrder(root.left,level+1);
        levelOrder(root.right,level+1);
        
    }
}
