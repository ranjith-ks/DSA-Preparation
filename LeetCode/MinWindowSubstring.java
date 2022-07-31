/*
Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
The testcases will be generated such that the answer is unique.
A substring is a contiguous sequence of characters within the string.
*/

class Solution {
    public String minWindow(String s, String t) {
        String res = "";
        Map<Character,Integer> hm = new HashMap<>();
        for(char c:t.toCharArray())
            hm.put(c,hm.getOrDefault(c,0)+1);
        int i=0,j=0,max = Integer.MAX_VALUE,size = hm.size();
        
        while(j<=s.length()) {
            if(size!=0) {
                if(j<s.length() && hm.containsKey(s.charAt(j))) {
                    hm.put(s.charAt(j),hm.get(s.charAt(j))-1);
                    if(hm.get(s.charAt(j))==0)
                        size--;
                }
                j++;
            }
            else {
                if(j-i<max) {
                    max = j-i;
                    res = s.substring(i,j);
                }
                if(hm.containsKey(s.charAt(i))) {
                    hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
                    if(hm.get(s.charAt(i))==1)
                        size++;
                }
                i++;
            }
        }
        return res;
    }
}