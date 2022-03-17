/*
You are given a 0-indexed integer array nums and an integer k.
You are initially standing at index 0. In one move, you can jump at most k steps forward without going outside the boundaries of the array. That is, you can jump from index i to any index in the range [i + 1, min(n - 1, i + k)] inclusive.
You want to reach the last index of the array (index n - 1). Your score is the sum of all nums[j] for each index j you visited in the array.
Return the maximum score you can get.
*/

class Solution {
    public int maxResult(int[] nums, int k) {
        Deque<Pair<Integer, Integer>> deque = new LinkedList<>() {{
            offer(new Pair<>(0, nums[0]));
        }};
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peekFirst().getKey() < i - k)
                deque.pollFirst();
            max = nums[i] + (deque.isEmpty() ? 0 : deque.peekFirst().getValue());
            while (!deque.isEmpty() && deque.peekLast().getValue() <= max)
                deque.pollLast();
            deque.offerLast(new Pair<>(i, max));
        }
        return max;
    }
}