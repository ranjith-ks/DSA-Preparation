/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.
*/

class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();
        int max = 0;
        Arrays.sort(nums);
        for(int i:nums) {
            if(hm.containsKey(i-1))
                hm.put(i,hm.get(i-1)+1);
            else
                hm.put(i,1);
            max = Math.max(max,hm.get(i));
        }
        return max;
    }
}