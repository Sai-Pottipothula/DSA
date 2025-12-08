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
class Solution {
    public boolean isPalindrome(ListNode head) {
       //First Find the middle 
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
      //Slow is the middle element 
       //Second reverse the second half of linked list 
       ListNode prev=null;
       ListNode curr=slow;
       while(curr!=null){
        ListNode temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
       }
       //prev is the last node
       //Third compare first half with the second half 
       ListNode start=head;
       ListNode end=prev;
       while(end!=null){
        if(start.val!=end.val)
            return false;
        start=start.next;
        end=end.next;
       }
       return true;
    }
}
