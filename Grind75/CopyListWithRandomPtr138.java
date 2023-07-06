/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head == null)
        {
            return null;
        }

        Node ptr = head;
        HashMap<Node,Node> map = new HashMap<>();

        //Pass 1 - create a deep copy
        // Map old nodes to new nodes in hashmap
        while(ptr != null)
        {
            Node ptr2 = new Node(ptr.val);
            map.put(ptr,ptr2);
            ptr = ptr.next;
        }

        //Pass 2 - add random pointer
        ptr = head;
        while(ptr != null)
        {
            Node temp = map.get(ptr);
            temp.next = map.get(ptr.next);
            temp.random = map.get(ptr.random);
            ptr = ptr.next;
            
        }

        return map.get(head);
        
    }
}