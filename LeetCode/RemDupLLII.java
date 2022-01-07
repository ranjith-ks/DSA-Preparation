/*
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.
*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = new ListNode(0);
        ListNode slow = temp,fast = head;
        slow.next = fast;
        while(fast!=null)
        {
            while(fast.next!=null && fast.val==fast.next.val)
                fast = fast.next;
            if(slow.next != fast)
            {
                slow.next = fast.next;
                fast = slow.next;
            }
            else
            {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return temp.next;
    }
}