/*
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
*/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0),p = temp;
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                p.next = list1;
                list1 = list1.next;
            }
            else
            {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        while(list1!=null)
        {
            p.next = list1;
            list1 = list1.next;
            p = p.next;
        }
        while(list2!=null)
        {
            p.next = list2;
            list2 = list2.next;
            p = p.next;
        }
        return temp.next;
    }
}