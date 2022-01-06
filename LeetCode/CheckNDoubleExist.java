/*
Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
More formally check if there exists two indices i and j such that :
i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
*/

class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int i,n=arr.length;
        for(i=0;i<n;i++)
        {
            if(set.contains(2*arr[i]) || (set.contains(arr[i]/2) && arr[i]%2==0 ))
                return true;
            set.add(arr[i]);
        }
        return false;
    }
}