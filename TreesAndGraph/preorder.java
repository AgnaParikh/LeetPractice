public class preorder {
    
        /**RECURSIVE
        ArrayList<Integer> traversal=new ArrayList<>();
        
        public List<Integer> preorderTraversal(TreeNode root) {
            
            helper(root);
            return traversal;
        }
        
        public void helper(TreeNode root){
            
            if(root==null){
                return;
            }
            
            traversal.add(root.val);
            helper(root.left);
            helper(root.right);
            
            
        }**/
        
        /**ITERATIVE**/
        ArrayList<Integer> traversal=new ArrayList<>();
            
        public List<Integer> preorderTraversal(TreeNode root){
            Stack<TreeNode> t=new Stack<TreeNode>();
            TreeNode x=null;
            
            if(root==null){
                return null;
            }
            
            t.push(root);
            //traversal.add(root.val);
            
            while(t.size()>0){
                x=t.pop();
                traversal.add(x.val);
                System.out.println(traversal.toString());
                
                if(x.right!=null){
                    t.push(root.right);
                }
                if(x.left!=null){
                    t.push(root.left);
                }
            }
            
            return traversal;
        }
        
    }
    
    
}
