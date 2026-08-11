// Last updated: 11/08/2026, 21:22:25
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode curr = dummy;
        while(curr!=null){
            if(curr.next!=null&&curr.next.val==val)
              curr.next=curr.next.next;
            else
              curr = curr.next;
        }
        return dummy.next;
    }
}