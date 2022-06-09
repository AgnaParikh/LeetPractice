p/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class PartitionLinkedList {
    public ListNode partition(ListNode head, int x) {
        
        /**
        Make two linked list with head and tail as pointers
        **/
        ListNode lesserHead=null;
        ListNode lesserTail=null;
        ListNode moreHead=null;
        ListNode moreTail=null;
        ListNode curr=head;
        
        //Edge case 1: if head is null
        if(head==null){
            return null;
        }
        
        while(curr!=null){
            
            if(curr.val<x){
                
                if(lesserHead==null){
                    lesserHead=new ListNode(curr.val);
                    lesserTail=lesserHead;
                }
                else{
                    lesserTail.next=new ListNode(curr.val);
                    lesserTail=lesserTail.next;
                }
            }
            else{
                    if(moreHead==null){
                        moreHead=new ListNode(curr.val);
                        moreTail=moreHead;
                    }
                    else{
                        moreTail.next=new ListNode(curr.val);
                        moreTail=moreTail.next;
                    }
            }
            curr=curr.next;
            
        }
        
        //Edge case 2: If all elements greater than x
        if(lesserHead==null){
            return moreHead;
        }
        
        lesserTail.next=moreHead;
        return lesserHead;
    }
        
}