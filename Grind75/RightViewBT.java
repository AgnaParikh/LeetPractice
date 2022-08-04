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
class RightViewBT {
    //Add values and update it to right, 
    //last value in the queue is right most value
    //Using BFS 
    public List<Integer> rightSideView(TreeNode root) {
        
        if(root==null){
            return new ArrayList<Integer>();
        }
        
        List<Integer> result=new ArrayList<>();
        Queue<TreeNode> bfs=new LinkedList<>();
        bfs.offer(root);
        
        while(!bfs.isEmpty()){
            int size=bfs.size();
            TreeNode right=null;
            
            for(int i=0;i<size;i++){
                
                right=bfs.poll();
                
                if(right.left!=null){
                    bfs.offer(right.left);
                }
                if(right.right!=null){
                    bfs.offer(right.right);
                }
                
            }
            
            result.add(right.val);
        }
        
        return result;
        
        
    }
}
