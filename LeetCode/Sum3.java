package LeetCode;
/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int i,start,end,n=nums.length;
        for(i=0;i<n;i++)
        {
            if(i>0 && nums[i-1]==nums[i])
                continue;
            start = i+1;
            end = n-1;
            int target = -nums[i];
            while(start<end)
            {
                if(start>i+1 && nums[start-1]==nums[start])
                {
                    start++;
                    continue;
                }

                if(end<n-1 && nums[end]==nums[end+1])
                {
                    end--;
                    continue;
                }

                int sum = nums[start] + nums[end];
                if(sum==target)
                {
                    List<Integer> trips = new ArrayList<Integer>();
                    trips.add(nums[i]);
                    trips.add(nums[start]);
                    trips.add(nums[end]);
                    res.add(trips);
                    start++;
                    end--;
                }
                else if(sum<target)
                    start++;
                else
                    end--;
            }
        }
        return res;
    }
}