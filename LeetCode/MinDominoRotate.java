/*
In a row of dominoes, tops[i] and bottoms[i] represent the top and bottom halves of the ith domino. (A domino is a tile with two numbers from 1 to 6 - one on each half of the tile.)
We may rotate the ith domino, so that tops[i] and bottoms[i] swap values.
Return the minimum number of rotations so that all the values in tops are the same, or all the values in bottoms are the same.
If it cannot be done, return -1.
*/

class Solution {
    public int minDominoRotations(int[] t, int[] b) {
        int ans = min(rotate(t,b,t[0]),rotate(t,b,b[0]),rotate(b,t,t[0]),rotate(b,t,b[0]));
        return ans==Integer.MAX_VALUE? -1: ans;
    }
    private int min(int p,int q,int r,int s)
    {
        return Math.min(p,Math.min(q,Math.min(r,s)));
    }
    private int rotate(int[] a,int[] b,int x)
    {
        int swap = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==x)
                continue;
            else if(b[i]==x)
                swap++;
            else
                return Integer.MAX_VALUE;
        }
        return swap;
    }
}