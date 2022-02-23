/*
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode temp = new ListNode(0);
        ListNode cur = temp;
        int prev = 101;
        while(head!=null)
        {
            if(prev!=head.val)
            {
                cur.next = new ListNode(head.val);
                cur = cur.next;
            }
            prev = head.val;
            head = head.next;
        }
        return temp.next;
    }
}