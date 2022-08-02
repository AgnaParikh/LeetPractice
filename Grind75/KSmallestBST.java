public class KSmallestBST {
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
    //Get using Inorder traversal
    ArrayList<Integer> traversed;
    
    //int ans=Integer.MAX_VALUE;
    
    public int kthSmallest(TreeNode root, int k) {
        
        if(root==null){
            return -1;
        }
        
        traversed=new ArrayList<>();
        
        inOrder(root,k);
        
        //return ans;
        
        return traversed.get(k-1);
        
    }
    
    private void inOrder(TreeNode root,int k){
        
        if(root==null){
            return;
        }
        
        inOrder(root.left,k);
        traversed.add(root.val);
        if(traversed.size()==k){
            return;
        }
        inOrder(root.right,k);
    }
    
    
}
