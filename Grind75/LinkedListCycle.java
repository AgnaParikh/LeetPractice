public class LinkedListCycle {

            /*
            * //Brute force
        public boolean hasCycle(ListNode head){
            
            if(head==null){
                return false;
            }
            
            ListNode curr=head;
            HashSet<ListNode> map=new HashSet<>();
            
            while(curr!=null){

                System.out.println(map.toString());
                if(map.contains(curr)){
                    return true;
                }
                
                else{
                    map.add(curr);
                }
            }
            
            return false;
        
        }
         */

        //Using fast slow runner technique
        public boolean hasCycle(ListNode head) {
        
            if(head==null){
                return false;
            }
            
            ListNode slow=head,fast=head.next;
            
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                
                if(fast==slow){
                    break;
                }
            }
            
            if(slow==fast){
                return true;
            }
            
            return false;
                    
        }
    
}
