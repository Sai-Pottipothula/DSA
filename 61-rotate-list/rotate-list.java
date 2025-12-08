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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;

        ListNode curr = head;
        int length=0;
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        ListNode s = head;
        ListNode f = head;
        for(int i=0;i<k%length;i++){
            f=f.next;
        }
        while(f.next!=null){
            s=s.next;
            f=f.next;
        }
        f.next=head;
        ListNode newHead = s.next;
        s.next=null;

        return newHead;
        
    }
}