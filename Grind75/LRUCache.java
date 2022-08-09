class LRUCache {
    
    //Need hashmap mapping Key as value and value as node
    public HashMap<Integer,Node> map;
    public Node head=new Node(-1,-1);
    public Node tail=new Node(-1,-1);
    int capacity;
    
    public LRUCache(int capacity) {
        map=new HashMap<>();
        head.next=tail;
        tail.next=head;
        this.capacity=capacity;
    }
    
    public int get(int key) {
        
        int result=-1;
        
        if(map.containsKey(key)){
            Node foundNode=map.get(key);
            result=foundNode.value;
            removeNode(foundNode);
            addToHead(foundNode);
        }
        return result;
        
    }
    
    public void put(int key, int value) {
        Node node;
        if(map.containsKey(key)){
            //Get node from hashmap
            node=map.get(key);
            int val=node.value;
            removeNode(node);
            //Add updated Node to the front
            addToHead(new Node(key,value));
        }
        else{
            node=new Node(key,value);
            if(map.size()==this.capacity){
                //Remove least recently used node
                //Tail is also dummy node
                removeNode(tail.prev);
            }
            addToHead(node);           
        }
        
        
    }
    
    //Add to front of linked list
    //Head is a dummy node
    private void addToHead(Node node){
        
        Node head_next=head.next;
        node.next=head_next; head_next.prev=node;
        head.next=node; node.prev=head;
        map.put(node.key,node);
                
    }
    
    //Remove node from linked list
    private void removeNode(Node node){
        
        map.remove(node.key);
        Node next_node=node.next;
        Node prev_node=node.prev;
        prev_node.next=next_node;
        next_node.prev=prev_node;
        
    }
}

public class Node{
    
    int key;
    int value;
    Node next;
    Node prev;
 
    public Node(int key,int value){
        this.key=key;
        this.value=value;
        this.next=null;
        this.prev=null;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */