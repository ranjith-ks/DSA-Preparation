/*
Given a string s, find the length of the longest substring without repeating characters.
*/
/*
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i,j,n=s.length(),ans=0;
        for(i=0;i<n;i++)
        {
            int freq[] = new int[256];
            for(j=i;j<n;j++)
            {
                int c = (int)s.charAt(j);
                if(freq[c]>0)
                    break;
                freq[c]++;
            }
            ans = Math.max(ans,j-i);
        }
        return ans;
    }
}
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,pos=0,max = 0,n = s.length();
        Map<Character,Integer> hm = new HashMap<>();
        char c;
        for(i=0;i<n;i++)
        {
            c = s.charAt(i);
            if(hm.containsKey(c))
                pos = Math.max(pos,hm.get(c)+1);
            max = Math.max(max,i-pos+1);
            hm.put(c,i);
        }
        return max;
    }
}