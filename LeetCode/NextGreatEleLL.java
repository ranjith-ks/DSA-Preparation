/*
You are given the head of a linked list with n nodes.
For each node in the list, find the value of the next greater node. That is, for each node, find the value of the first node that is next to it and has a strictly larger value than it.
Return an integer array answer where answer[i] is the value of the next greater node of the ith node (1-indexed). If the ith node does not have a next greater node, set answer[i] = 0.
*/

class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> a = new ArrayList<>();
        int i=0,n=0;
        for(ListNode cur=head;cur!=null;cur=cur.next)
        {
            a.add(cur.val);
            n++;
        }
        Stack<Integer> s = new Stack<>();
        int res[] = new int[n];
        for(i=0;i<n;i++)
        {
            while(!s.empty() && a.get(s.peek())<a.get(i))
                res[s.pop()] = a.get(i);
            s.push(i);
        }
        return res;
    }
}