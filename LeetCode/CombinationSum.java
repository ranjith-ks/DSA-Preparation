/*
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.
It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
*/

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<>(), candidates, target, 0);
        return list;    
    }
    private void backtrack(List<List<Integer>> list, List<Integer> temp, int [] nums, int rem, int start) {
        if(rem < 0)
            return;
        else if(rem == 0)
            list.add(new ArrayList<>(temp));
        else {
            for(int i = start; i < nums.length; i++) {
                temp.add(nums[i]);
                backtrack(list, temp, nums, rem - nums[i], i);
                temp.remove(temp.size() - 1);
            }
        }
    }
}