/*
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.
*/

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0 || lists==null)
            return null;
        ListNode dummy = new ListNode(0),tail = dummy;
        Queue<ListNode> q = new PriorityQueue<>(new Comparator<ListNode>(){
            @Override
            public int compare(ListNode a,ListNode b)
            {
                return a.val-b.val;
            }
        });
        for(ListNode node: lists)
            if(node!=null)
                q.offer(node);
        while(!q.isEmpty())
        {
            tail.next = q.poll();
            tail = tail.next;
            if(tail.next!=null)
                q.offer(tail.next);
        }
        return dummy.next;
    }
}