/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0),p=head;
        int carry = 0,sum;
        while(l1!=null || l2!=null || carry!=0)
        {
            sum = carry;
            if(l1!=null) 
            {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2!=null)
            {
                sum += l2.val;
                l2 = l2.next;
            }
            p.next = new ListNode(sum%10);
            carry = sum/10;
            p = p.next;
        }
        return head.next;
    }
}