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
class binaryTreePaths {
    
    ArrayList<String> ans=new ArrayList<String>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        
        if(root==null){
            return new ArrayList<String>();
        }
        
        binaryTree(root,"");
        return ans;
        
    }
    
     private void binaryTree(TreeNode root,String s){
         
         if(root.left==null && root.right==null){
            if(s==""){
                ans.add(String.valueOf(root.val));
             }
             else{
                ans.add(s+"->"+root.val);   
             }
         }
         
         if(root.left!=null){
             //System.out.println(s);
             if(s==""){
                 binaryTree(root.left,String.valueOf(root.val));
             }
             else{
                 binaryTree(root.left,s+"->"+String.valueOf(root.val));
             }
             
         }
         if(root.right!=null){
            if(s==""){
                 binaryTree(root.right,String.valueOf(root.val));
             }
             else{
                 binaryTree(root.right,s+"->"+String.valueOf(root.val));
             }
         }
         
    }
}