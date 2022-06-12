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
class getMinimumDifference {
    
    //APPROACH 1: Use the inorder traversal (left - root - right) 
    // Store traversal in an arraylist - is sorted
    // get min difference between conseq numbers from arraylist
    // O(n) : n is number of nodes
    
    ArrayList<Integer> nodes=new ArrayList<>();
    
    public int getMinimumDifference(TreeNode root) {
        
        int min=Integer.MAX_VALUE;
        
        if(root==null){
            return 0;
        }
        
        //Put all nodes to an array
        iterateNode(root);
        System.out.println(nodes.toString());
        
        for(int i=1;i<nodes.size();i++){
            int diff=Math.abs(nodes.get(i)-nodes.get(i-1));
            if(diff<min){
                min=diff;
            }
        }
        
        return min; 
        
    }
    
    private void iterateNode(TreeNode root){
        
        if(root==null){
            return;
        }
        
        iterateNode(root.left);
        nodes.add(root.val);
        iterateNode(root.right);
    }
}