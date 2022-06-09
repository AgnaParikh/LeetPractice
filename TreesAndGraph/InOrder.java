public class InOrder {
    //Left -- Root -- Right//
    /**RECURSIVE
    ArrayList<Integer> traversal = new ArrayList<Integer>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        if(root==null){
            return new ArrayList<Integer>();
        }
        
        inorderTraversal(root.left);
        traversal.add(root.val);
        inorderTraversal(root.right);
        
        return traversal;
    }
    **/
    
    /**ITERATIVE**/
    public List<Integer> inorderTraversal(TreeNode root){
        
        Stack<TreeNode> t=new Stack<TreeNode>();
        ArrayList<Integer> traversal = new ArrayList<Integer>();
        TreeNode x=root;
        boolean done=false;
        
        while(!done){
            if(x!=null){
                t.push(x);
                x=x.left;
            }
            else{
                if(t.empty()){
                    done=true;
                }
                else{
                    x=t.pop();
                    traversal.add(x.val);
                    x=x.right;
                }
            }
        }
        
        return traversal;
        
        
    }
    
}