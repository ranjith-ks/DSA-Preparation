/*
You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.
Return a list of integers representing the size of these parts.
*/

class Solution {
    public List<Integer> partitionLabels(String s) {
        int i,j,n=s.length(),start=0,end=0;
        int lastOccur[] = new int[26];
        List<Integer> res = new ArrayList<>();
        for(i=0;i<n;i++)
            lastOccur[s.charAt(i)-'a'] = i;
        for(i=0;i<n;i++)
        {
            end = Math.max(end,lastOccur[s.charAt(i)-'a']);
            if(end==i)
            {
                res.add(end-start+1);
                start = end+1;
            }
        }
        return res;
    }
}