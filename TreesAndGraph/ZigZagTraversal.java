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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        if(root==null){
            return new ArrayList<>();
        }
        
        ArrayList<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int level=-1;
        
        while(!queue.isEmpty()){
            int currSize=queue.size();
            level++;
            
            ArrayList<Integer> levelNode=new ArrayList<>();
                
                for(int i=0;i<currSize;i++){
                    TreeNode curr=queue.poll();
                    levelNode.add(curr.val);

                    if(curr.left!=null){
                        queue.add(curr.left);
                    }
                    if(curr.right!=null){
                        queue.add(curr.right);   
                    }
                
                }

            if(level%2==1){
                Collections.reverse(levelNode);
            }
            ans.add(levelNode);
        }
        
        System.out.println(ans.toString());
        
        return ans;
    }
}