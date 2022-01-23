/*
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.
*/

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        int i,j,left,right,n=nums.length;
        for(i=0;i<n-3;i++)
        {
            for(j=i+1;j<n-2;j++)
            {
                left = j+1;
                right = n-1;
                while(left<right)
                {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum==target)
                    {
                        set.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                    }
                    else if(sum<target)
                        left++;
                    else if(sum>target)
                        right--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}