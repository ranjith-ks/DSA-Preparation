/*
Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.
*/

class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stk = new Stack<>();
        int n = s.length();
        int[] freq = new int[26];
        boolean[] exist = new boolean[26];
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            freq[c-'a']++;
        }
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            freq[c-'a']--;
            if(exist[c-'a'])
                continue;
            while(!stk.empty() && stk.peek()>c && freq[stk.peek()-'a']>0)
                exist[stk.pop()-'a'] = false;
            stk.push(c);
            exist[c-'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.empty())
            sb.append(stk.pop());
        return sb.reverse().toString();
    }
}