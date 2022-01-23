/*
An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.
*/

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int[] seqNum = {12,23,34,45,56,67,78,89,
                       123,234,345,456,567,678,789,
                       1234,2345,3456,4567,5678,6789,
                       12345,23456,34567,45678,56789,
                       123456,234567,345678,456789,
                       1234567,2345678,3456789,
                       12345678,23456789,123456789};
        List<Integer> res = new ArrayList<>();
        int i,n=seqNum.length;
        for(i=0;i<n;i++)
        {
            if(seqNum[i]<low) continue;
            if(seqNum[i]>high) break;
            res.add(seqNum[i]);
        }
        return res;
    }
}