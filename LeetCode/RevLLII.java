/*
Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
*/

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = new ListNode(0),prev,then,start;
        temp.next = head;
        prev = temp;
        for(int i=1;i<left;i++)
            prev = prev.next;
        start = prev.next;
        then = start.next;
        for(int i=0;i<right-left;i++) {
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }
        return temp.next;
    }
}