/*
Given an integer numRows, return the first numRows of Pascal's triangle.
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> l = new ArrayList<>(i+1);
            l.add(1);
            for(int j=1;j<i;j++)
                l.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            if(i!=0)
                l.add(1);
            res.add(l);
        }
        return res;
    }
}