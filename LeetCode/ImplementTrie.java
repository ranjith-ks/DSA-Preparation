/*
A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and retrieve keys in a dataset of strings. There are various applications of this data structure, such as autocomplete and spellchecker.
Implement the Trie class:
Trie() Initializes the trie object.
void insert(String word) Inserts the string word into the trie.
boolean search(String word) Returns true if the string word is in the trie (i.e., was inserted before), and false otherwise.
boolean startsWith(String prefix) Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise.
*/

class Trie {

    class TrieNode {
        public boolean isWord;
        public TrieNode[] children = new TrieNode[26];
        public TrieNode() {}
    }
    
    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode ws = root;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(ws.children[c - 'a'] == null)
                ws.children[c - 'a'] = new TrieNode();
            ws = ws.children[c - 'a'];
        }
        ws.isWord = true;
    }
    
    public boolean search(String word) {
        TrieNode ws = root;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(ws.children[c - 'a'] == null)
                return false;
            ws = ws.children[c - 'a'];
        }
        return ws.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode ws = root;
        for(int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if(ws.children[c - 'a'] == null)
                return false;
            ws = ws.children[c - 'a'];
        }
        return true;
    }
}