/*
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
After doing so, return the array.
*/

class Solution {
    public int[] replaceElements(int[] arr) {
        int i,n=arr.length,max=Integer.MIN_VALUE;
        for(i=0;i<n-1;i++)
        {
            if(max<=arr[i])
                max = maxRight(arr,i+1,n);
            arr[i] = max;
        }
        arr[i] = -1;
        return arr;
    }
    private int maxRight(int[] a,int start,int end)
    {
        int max = Integer.MIN_VALUE;
        for(int i=start;i<end;i++)
            max = max>a[i]?max:a[i];
        return max;
    }
}