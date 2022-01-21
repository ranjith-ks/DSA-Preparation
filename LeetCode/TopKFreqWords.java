/*
Given an array of strings words and an integer k, return the k most frequent strings.
Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.
*/

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> hm = new HashMap<>();
        int i,n=words.length;
        for(i=0;i<n;i++)
            hm.put(words[i],hm.getOrDefault(words[i],0)+1);
        List<String> res = new ArrayList<>(hm.keySet());
        Collections.sort(res, (a,b) -> hm.get(a).equals(hm.get(b))?
                         a.compareTo(b): hm.get(b)-hm.get(a));

        return res.subList(0,k);
    }
}