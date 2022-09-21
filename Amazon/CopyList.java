public class CopyList {

        public Node copyRandomList(Node head) {
            
                //HashMap with key as Index and 
               HashMap<Node, Node> mp = new HashMap<>();
            Node temp = head;
            Node dummy = new Node(0);
            Node tempCopy = dummy;
    
            while(temp != null){
                Node n = new Node(temp.val);
                tempCopy.next = n;
                tempCopy = n;
                mp.put(temp, n);
                temp = temp.next;
            }
            temp = head;
    
            while(temp != null){
                mp.get(temp).random = mp.get(temp.random);
                temp = temp.next;
            }
    
            return dummy.next;
            
        }
    
}
