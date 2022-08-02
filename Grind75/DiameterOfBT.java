public class DiameterOfBT {

        public int diameterOfBinaryTree(TreeNode root) {
            
            if(root==null){
                return 0;
            }
            int ld=diameterOfBinaryTree(root.left);
            int rd=diameterOfBinaryTree(root.right);
            int h=getHeight(root.left)+getHeight(root.right);
            int dia=Math.max(h,Math.max(ld,rd));
            return dia;
            
        }
        
        private int getHeight(TreeNode root){
            
            if(root==null){
                return 0;
            }
            
            int left=getHeight(root.left)+1;
            
            int right=getHeight(root.right)+1;
            
            return Math.max(left,right);
            
        }
}
