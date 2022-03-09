/*
Given an integer array nums of unique elements, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.
*/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        findSubset(res,new ArrayList<>(), nums, 0);
        return res;
    }
    private void findSubset(List<List<Integer>> res,List<Integer> l,int[] a,int start)
    {
        res.add(new ArrayList<>(l));
        for(int i=start;i<a.length;i++)
        {
            l.add(a[i]);
            findSubset(res,l,a,i+1);
            l.remove(l.size()-1);
        }
    }
}