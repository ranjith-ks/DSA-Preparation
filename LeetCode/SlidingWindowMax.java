/*
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
Return the max sliding window.
*/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int i,n=nums.length,j=0;
        int[] res = new int[n-k+1];
        for(i=0;i<n;i++)
        {
            while(!dq.isEmpty() && nums[dq.getLast()]<=nums[i])
                dq.removeLast();
            dq.addLast(i);
            if(dq.getFirst()==i-k)
                dq.removeFirst();
            if(i>=k-1)
                res[j++] = nums[dq.peek()];
        }
        return res;
    }
}