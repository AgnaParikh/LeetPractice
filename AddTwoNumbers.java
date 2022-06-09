public class AddTwoNumbers {
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode ptr1=l1;
        ListNode ptr2=l2;
        ListNode head=null;
        ListNode ptr=null;
        int sum=0;
        int carry=0;
        int a,b;
        
        
        while(ptr1!=null || ptr2!=null){
            
            if(ptr1==null){
                a=0;
            }
            else{
                a=ptr1.val;
            }
            
            if(ptr2==null){
                b=0;
            }
            else{
                b=ptr2.val;
            }
            
            sum=(a+b+carry)%10;
            carry=(a+b+carry)/10;
            System.out.println("sum "+sum+" Carry "+carry);
            
            //add summ node
            if(head==null){
                head=new ListNode(sum);
                ptr=head;
            }
            else{
                ptr.next=new ListNode(sum);
                ptr=ptr.next;
            }
            
            if(ptr1!=null){
                ptr1=ptr1.next;
            }
            if(ptr2!=null){
                ptr2=ptr2.next;
            }
            
            
        }
        
        if(carry>0){
            ptr.next=new ListNode(carry);
        }
        
        return head;
        
    }
}
    
