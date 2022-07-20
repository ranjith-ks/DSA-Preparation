/*
Given the head of a singly linked list, return true if it is a palindrome.
*/

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast,slow,prev,temp;
        fast = slow = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = slow;
        slow = slow.next;
        prev.next = null;
        while(slow!=null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        fast = head;
        slow = prev;
        while(slow!=null) {
            if(fast.val!=slow.val)
                return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
}