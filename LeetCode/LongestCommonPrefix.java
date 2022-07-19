/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String small = strs[0], large = strs[strs.length-1];
        int c = 0;
        while(c<small.length() && small.charAt(c)==large.charAt(c))
            c++;
        return c==0?"":small.substring(0,c);
    }
}