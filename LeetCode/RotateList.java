/*
Given the head of a linked list, rotate the list to the right by k places.
*/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0)
            return head;
        ListNode ptr = head;
        int len = 1;
        for(;ptr.next!=null;ptr=ptr.next)
            len++;
        k %= len;
        ptr.next = head;
        for(int i=0;i<len-k;i++)
            ptr = ptr.next;
        head = ptr.next;
        ptr.next = null;
        return head;
    }
}