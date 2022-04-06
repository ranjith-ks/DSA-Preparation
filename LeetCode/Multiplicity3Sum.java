/*
Given an integer array arr, and an integer target, return the number of tuples i, j, k such that i < j < k and arr[i] + arr[j] + arr[k] == target.
As the answer can be very large, return it modulo 109 + 7.
*/

class Solution {
    public int threeSumMulti(int[] arr, int target) {
        long[] freq = new long[101];
        long res = 0;
        for(int i: arr)
            freq[i]++;
        for(int i=0;i<101;i++)
        {
            for(int j=i;j<101;j++)
            {
                int k = target-i-j;
                if(k>100 || k<0)
                    continue;
                if(i==j && i==k)
                    res += freq[i] * (freq[i]-1) * (freq[i]-2)/6;
                else if(i==j && i!=k)
                    res += freq[i] * (freq[i]-1)/ 2*freq[k];
                else if(j<k)
                    res += freq[i]*freq[j]*freq[k];
            }
        }
        return (int)(res%(1e9+7));
    }
}