public class BTFromPreOrderAndInorder{

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
class Solution {
    
    //preoder root index
    int preIndex;
    HashMap<Integer,Integer> map;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        map=new HashMap<>();
        preIndex=0;
        
        //Set value and index for inorder 
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        
        return buildTree(preorder,0,preorder.length-1);
    }
            
    public TreeNode buildTree(int[] preorder,int left,int right){
            
            //Base case 
            if(left>right){
                return null;
            }
        
            //Select preIndex as root and create a root
            int rootValue=preorder[preIndex++];
            TreeNode root=new TreeNode(rootValue);
        
            //Build left and right subtrees
            root.left=buildTree(preorder,left,map.get(rootValue)-1);
            root.right=buildTree(preorder,map.get(rootValue)+1,right);
        
            return root;
    }

}
    
