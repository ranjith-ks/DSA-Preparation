/*
Given an array of integers arr and two integers k and threshold.

Return the number of sub-arrays of size k and average greater than or equal to threshold.
*/

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        if(k>n)
            return 0;
        int i,sum=0,tot,res=0,j;
        tot = k*threshold;
        for(i=0;i<k;i++)
        {
            sum += arr[i];
        }
        if(sum>=tot)
            res++;
        i = 0;
        j = k;
        while(j<n)
        {
            sum -= arr[i];
            sum += arr[j];
            i++;
            j++;
            if(sum>=tot)
                res++;
        }

        return res;
    }
}