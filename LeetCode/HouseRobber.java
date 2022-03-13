/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
*/

/*
class Solution {
    Map<Integer,Integer> dp = new HashMap<>();
    public int rob(int[] nums) {
        int n=nums.length, x = rob(nums,n,0), y = rob(nums,n,1);
        return Math.max(x,y);
    }
    private int rob(int[] nums,int n,int i)
    {
        if(i>=n)
            return 0;
        if(dp.containsKey(i))
            return dp.get(i);
        int x = nums[i] + rob(nums,n,i+2);
        int y = nums[i] + rob(nums,n,i+3);
        dp.put(i,Math.max(x,y));
        return dp.get(i);
    }
}
*/

/*
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)
            return nums[0];
        int[] dp = new int[n];
        for(int i=0;i<n;i++)
        {
            dp[i] = nums[i];
            if(i>2)
                dp[i] += Math.max(dp[i-2],dp[i-3]);
            else if(i==2)
                dp[i] += dp[i-2];
        }
        return Math.max(dp[n-1],dp[n-2]);
    }
}
*/

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)
            return nums[0];
        int adj1,adj2,adj3;
        adj1 = adj2 = adj3 = 0;
        for(int i=0;i<n;i++)
        {
            int x = nums[i];
            x += Math.max(adj2,adj3);
            adj3 = adj2;
            adj2 = adj1;
            adj1 = x;
        }
        return Math.max(adj1,adj2);
    }
}