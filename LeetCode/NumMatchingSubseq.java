/*
Given a string s and an array of strings words, return the number of words[i] that is a subsequence of s.
A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
For example, "ace" is a subsequence of "abcde".
*/

class Solution {
    class TrieNode {
        char c;
        int end;
        TrieNode[] children;
        public TrieNode(char c) {
            this.c = c;
            this.end = 0;
            this.children = new TrieNode[26];
        }
    }
    public int numMatchingSubseq(String s, String[] words) {
        TrieNode root = createTrie(words);
        return dfs(root,0,s);
    }
    private TrieNode createTrie(String[] words) {
        TrieNode root = new TrieNode('*');
        for(String word:words)
            addWord(root,word);
        return root;
    }
    private void addWord(TrieNode root,String word) {
        for(char c:word.toCharArray()) {
            if(root.children[c-'a']==null)
                root.children[c-'a'] = new TrieNode(c);
            root = root.children[c-'a'];
        }
        root.end++;
    }
    private int dfs(TrieNode root,int pos,String s) {
        if(root==null)
            return 0;
        int idx = s.indexOf(root.c,pos);
        if(root.c!='*' && idx==-1)
            return 0;
        int res = root.end;
        for(int i=0;i<26;i++)
            res += dfs(root.children[i],root.c=='*'?0:idx+1,s);
        return res;
    }
}