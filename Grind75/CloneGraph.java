/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class CLoneGraph {
    public Node cloneGraph(Node node) {
        
        if(node == null){
            return null;
        }
        
        Map<Integer,Node> map=new HashMap<>();
        
        //Helper DFS method
        return DFS(node, map);
        
    }
    
    private Node DFS(Node node,Map<Integer,Node> map){
        
        if(map.containsKey(node.val)){
            return map.get(node.val);
        }
        
        //If not present create new node
        Node copy=new Node(node.val);
        map.put(node.val,copy);
        
        for(Node neighbor:node.neighbors){
            copy.neighbors.add(DFS(neighbor,map));
        }
        
        return copy;
    }
}
