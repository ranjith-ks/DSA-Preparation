/*
Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
*/
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n,i,j,k;
        n = arr.length;
        for(i=0,j=i+1,k=j+1;i<n-2;i++,j++,k++)
            if(arr[i]%2==1 && arr[j]%2==1 && arr[k]%2==1)
                return true;
        return false;
    }
}