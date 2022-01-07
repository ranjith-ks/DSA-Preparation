/*
Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
The first node is considered odd, and the second node is even, and so on.
Note that the relative order inside both the even and odd groups should remain as it was in the input.
You must solve the problem in O(1) extra space complexity and O(n) time complexity.
*/

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode oddHead = null, oddTail = null;
        ListNode evenHead = null, evenTail = null;
        ListNode cur = head;
        int i = 1;
        while(cur!=null)
        {
            if(i%2==1)
            {
                if(oddHead==null)
                    oddHead = oddTail = cur;
                else
                {
                    oddTail.next = cur;
                    oddTail = cur;
                }
            }
            else
            {
                if(evenHead==null)
                    evenHead = evenTail = cur;
                else
                {
                    evenTail.next = cur;
                    evenTail = cur;
                }
            }
            i++;
            cur = cur.next;
        }
        evenTail.next = null;
        oddTail.next = evenHead;
        return oddHead;
    }
}