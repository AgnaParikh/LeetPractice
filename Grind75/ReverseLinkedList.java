/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ReverseLinkedList {
    
    //Recursive
    //TC O(n) SC O(n)
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode newNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
                
    }
    
    //Iterative
    // TC: O(n) SC: O(1)
   /* public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null) {
            ListNode cNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = cNext;
        }
        head = prev;
        return head;
    }*/
    
    
    //Iterative solution O(n)
    /*public ListNode reverseList(ListNode head) {
        
        if(head==null){
            return head;
        }
        
        Stack<Integer> traversal=new Stack<>();
        
        ListNode curr=head;
        while(curr!=null){
            traversal.push(curr.val);
            curr=curr.next;
        }
        
        //Pop from stack and add to head
        curr=head;
        while(curr!=null){
            curr.val=traversal.pop();
            curr=curr.next;
        }
        
        return head;
        
    }*/
}
