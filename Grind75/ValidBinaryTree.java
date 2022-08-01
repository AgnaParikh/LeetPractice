public class ValidBinaryTree {
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
                
    ArrayList<Integer> inOrder;
    
    public boolean isValidBST(TreeNode root) {
        
        inOrder=new ArrayList<>();
        
        InOrderTraversal(root);
        System.out.println(inOrder.toString());
        
        for(int i=1;i<inOrder.size();i++){
            
            if(inOrder.get(i-1)>=inOrder.get(i)){
                return false;
            }
        }
        
        return true;
        
    }
    
    private void InOrderTraversal(TreeNode root){
        
        if(root==null){
            return;
        }
        
        InOrderTraversal(root.left);
        inOrder.add(root.val);
        InOrderTraversal(root.right);
        
    }
}
