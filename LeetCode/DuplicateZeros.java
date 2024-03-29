/*
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
*/

class Solution {
    public void duplicateZeros(int[] arr) {
        int i,n=arr.length,j,next;
        for(i=0;i<n;i++)
        {
            if(arr[i]==0 && i+1<n)
            {
                for(j=n-1;j>i+1;j--)
                    arr[j] = arr[j-1];
                arr[j] = 0;
                i++;
            }
        }
    }
}