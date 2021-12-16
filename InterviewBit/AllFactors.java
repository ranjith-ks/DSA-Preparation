/*
Given a number N, find all factors of N.
Example:
N = 6
factors = {1, 2, 3, 6}
Make sure the returned array is sorted.
*/

public class Solution {
    public ArrayList<Integer> allFactors(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int i,ul = (int)Math.sqrt(n);
        for(i=1;i<=ul;i++)
        {
            if(n%i==0)
            {
                res.add(i);
                if(i != n/i)
                    res.add(n/i);
            }
        }
        Collections.sort(res);
        return res;
    }
}
