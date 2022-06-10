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
/**
100/104 test cases passed
class Solution {
    
    //Approach: Sum height of left sub tree and right subtree
    public int diameterOfBinaryTree(TreeNode root) {
        
        int left=0;
        int right=0;
        if(root.left!=null){
            left=diameter(root.left,1);
        }
        if(root.right!=null){
            right=diameter(root.right,1);
        }
        
        System.out.println(left+right);
        return left+right;
        
    }
    
    private int diameter(TreeNode root,int pathLen){
        
        int left=0;
        int right=0;
        
        if(root.left==null && root.right==null){
                
                return pathLen;

        }
        
        if(root.left!=null){
            
            left=diameter(root.left,pathLen+1);
        }
        
        if(root.right!=null){
            
            right=diameter(root.right,pathLen+1);
        }
        
        return left>right?left:right;
    }
}**/

class diameterOfBinaryTree {
    public static int height(TreeNode node){
        if(node==null){
            return -1;
        }
        int lh=height(node.left);
        int rh=height(node.right);
        return Math.max(lh,rh)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null){
            return 0;
        }
        int ld=diameterOfBinaryTree(root.left);
        int rd=diameterOfBinaryTree(root.right);
        int h=height(root.left)+height(root.right)+2;
        int dia=Math.max(h,Math.max(ld,rd));
        return dia;
    }
}