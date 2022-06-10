/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

//MAX depth of N-Ary Tree

class maxDepth {
    
    //HashSet<Integer> depths=new HashSet<Integer>();
    
    /** APPROACH 1
    int max=0;
    
    public int maxDepth(Node root) {
        
        if(root==null){
            return 0;
        }
        
        maxDepth(root,0);
        
        return max;
        
    }
    
    private void maxDepth(Node root, int depth){
        
        if(root.children.size()==0){
            //System.out.println(depth+1);
            //depths.add(depth+1);
            if(depth+1>max){
                max=depth+1;
            }
            return;
        }
        
        for(Node x:root.children){
           //if(x==null){
           //     System.out.println("null");
            //}
            //System.out.println(x.val);
            
            maxDepth(x,depth+1);
        }
    }**/
    
    public int maxDepth(Node root) {
    if(root == null)return 0;
    int hi = 1;
  
   for(Node c : root.children){
       hi = Math.max(hi , 1 +maxDepth(c));
   }
    return hi;
}
}