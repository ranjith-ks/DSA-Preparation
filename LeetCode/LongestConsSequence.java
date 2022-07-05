/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.
*/

/*
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
*/

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        Set<Integer> hs = new HashSet<>();
        for(int i:nums) hs.add(i);
        int max = 1;
        for(int i:nums) {
            if(hs.remove(i)) {
                int val = i;
                int sum = 1;
                while(hs.remove(val-1))
                    val--;
                sum += i - val;
                val = i;
                while(hs.remove(val+1))
                    val++;
                sum += val - i;
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}