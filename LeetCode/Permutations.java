/*
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
*/

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> temp, int [] nums) {
        if(temp.size() == nums.length)
            list.add(new ArrayList<>(temp));
        else {
            for(int i = 0; i < nums.length; i++) {
                if(temp.contains(nums[i]))
                    continue;
                temp.add(nums[i]);
                backtrack(list, temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }
}