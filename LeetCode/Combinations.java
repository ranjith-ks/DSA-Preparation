/*
Given two integers n and k, return all possible combinations of k numbers out of the range [1, n].
You may return the answer in any order.
*/

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        findCombinations(res,new ArrayList<>(),1,n,k);
        return res;
    }
    private void findCombinations(List<List<Integer>> res,List<Integer> curr,int start,int n,int k)
    {
        if(k==0)
            res.add(new ArrayList<>(curr));
        else
        {
            for(int i=start;i<=n;i++)
            {
                curr.add(i);
                findCombinations(res,curr,i+1,n,k-1);
                curr.remove(curr.size()-1);
            }
        }
    }
}