/*
Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements. 
Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
a, b are from arr
a < b
b - a equals to the minimum absolute difference of any two elements in arr
*/

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int i,n=arr.length,temp,min=arr[1]-arr[0];
        for(i=0;i<n-1;i++)
        {
            temp = arr[i+1]-arr[i];
            if(temp<min)
            {
                System.out.println(temp+" "+min);
                res.clear();
                List<Integer> a = new ArrayList<>();
                a.add(arr[i]);
                a.add(arr[i+1]);
                res.add(a);
                min = temp;
            }
            else if(temp==min)
            {
                List<Integer> a = new ArrayList<>();
                a.add(arr[i]);
                a.add(arr[i+1]);
                res.add(a);
            }
        }
        return res;
    }
}