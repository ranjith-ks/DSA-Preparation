/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i=0;i<n;i++)
            fast = fast.next;
        if(fast==null)
            return head.next;
        while(fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}