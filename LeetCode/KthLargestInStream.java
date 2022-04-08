/*
Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.
Implement KthLargest class:
KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of integers nums.
int add(int val) Appends the integer val to the stream and returns the element representing the kth largest element in the stream.
*/

class KthLargest {
    private Queue<Integer> pq;
    private int n;

    public KthLargest(int k, int[] nums) {
        n = k;
        pq = new PriorityQueue<>();
        for(int i:nums)
        {
            pq.offer(i);
            if(pq.size()>k)
                pq.poll();
        }
    }

    public int add(int val) {
        pq.offer(val);
        if(pq.size()>n)
            pq.poll();
        return pq.peek();
    }
}