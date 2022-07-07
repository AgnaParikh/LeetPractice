public /**
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
class BalancedBinaryTree {
   
  
   //Time complexity: 
   public boolean isBalanced(TreeNode root) {
       
       if(root==null){
           return true;
       }
       
       int diff=Math.abs(getHeight(root.left)-getHeight(root.right));
       
       if(diff>1){
           return false;
       }
       
       return isBalanced(root.left) && isBalanced(root.right);
               
   }
   
   private int getHeight(TreeNode root){
       
       if(root==null){
           return 0;
       }
       
       return Math.max(getHeight(root.left),getHeight(root.right))+1;

   }
} Main {
    
}
