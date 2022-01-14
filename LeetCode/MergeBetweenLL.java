/*
You are given two linked lists: list1 and list2 of sizes n and m respectively.
Remove list1's nodes from the ath node to the bth node, and put list2 in their place.
The blue edges and nodes in the following figure indicate the result:
Build the result list and return its head.
*/

class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int i;
        ListNode start = null,end = list1;
        for(i=0;i<b;i++,end = end.next)
            if(i==a-1)
                start = end; // start.next to be deleted
        start.next = list2; //appending list2 to start
        while(list2.next!=null)
            list2 = list2.next;
        list2.next = end.next;
        end.next = null; // removing link between end node and end.next in list1
        return list1;
    }
}