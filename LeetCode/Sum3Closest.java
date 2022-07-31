/*
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.
*/

/*
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int i,j,k,n=nums.length,diff,min,sum,ans;
        ans = nums[0] + nums[1] + nums[2];
        min = Math.abs(target-ans);
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                for(k=j+1;k<n;k++)
                {
                    sum = nums[i] + nums[j] + nums[k];
                    diff = Math.abs(target-sum);
                    if(diff<min)
                    {
                        ans = sum;
                        min = diff;
                    }
                }
            }
        }
        return ans;
    }
}
*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length -2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while(left  < right) {
                int sum = nums[i] + nums[right] + nums[left]; 
                if(Math.abs(target - sum) < Math.abs(target - closest))
                    closest = sum ;
                if(sum < target)
                    left ++;
                else if(sum > target)
                    right --;
                else
                    return sum;
            }
        }
        return closest;
    }
}