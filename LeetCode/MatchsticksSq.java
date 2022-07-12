/*
You are given an integer array matchsticks where matchsticks[i] is the length of the ith matchstick. You want to use all the matchsticks to make one square. You should not break any stick, but you can link them up, and each matchstick must be used exactly one time.
Return true if you can make this square and false otherwise.
*/

class Solution {
    public boolean makesquare(int[] matchsticks) {
        if(matchsticks.length<4)
            return false;
        int sum = 0;
        for(int i:matchsticks) sum += i;
        if(sum%4 != 0)
            return false;
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        return dfs(matchsticks,new int[4],0,sum/4);
    }
    private boolean dfs(int[] a,int[] sum,int index,int target) {
        if(index==a.length) {
            if(sum[0]==target && sum[1]==target && sum[2]==target && sum[3]==target)
                return true;
            return false;
        }
        for(int i=0;i<4;i++) {
            if(sum[i]+a[index]>target)
                continue;
            sum[i] += a[index];
            if(dfs(a,sum,index+1,target))
                return true;
            sum[i] -= a[index];
        }
        return false;
    }
    private void reverse(int[] a) {
        int i = 0,j = a.length-1;
        while(i<j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;j--;
        }
    }
}