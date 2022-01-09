/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
*/

/*
class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> hm = new HashMap<>();
        int i,n=s.length();
        for(i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);
        }
        for(i=0;i<n;i++)
        {
            if(hm.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}
*/

/*
class Solution {
    public int firstUniqChar(String s) {
        int i,n=s.length();
        for(i=0;i<n;i++)
        {
            int index = s.indexOf(s.charAt(i));
            int lastIndex = s.lastIndexOf(s.charAt(i));
            if(index==lastIndex)
                return index;
        }
        return -1;
    }
}
*/

class Solution {
    public int firstUniqChar(String s) {
        int ans=Integer.MAX_VALUE;
        for(char c='a';c<='z';c++)
        {
            int index = s.indexOf(c);
            if(index!=-1 && index==s.lastIndexOf(c))
                ans = Math.min(ans,index);
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}