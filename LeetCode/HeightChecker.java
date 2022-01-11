/*
A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
Return the number of indices where heights[i] != expected[i].
*/

/*
class Solution {
    public int heightChecker(int[] heights) {
        int i,n=heights.length,res=0;
        int exp[] = new int[n];
        for(i=0;i<n;i++)
            exp[i] = heights[i];
        Arrays.sort(exp);
        for(i=0;i<n;i++)
            if(heights[i]!=exp[i])
                res++;
        return res;
    }
}
*/

class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length,res=0,cur=0;
        int freq[] = new int[101];
        for(int h:heights)
            freq[h]++;
        for(int h:heights)
        {
            while(freq[cur]==0)
                cur++;
            if(cur!=h)
                res++;
            freq[cur]--;
        }
        return res;
    }
}