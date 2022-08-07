/*
Given an integer n, your task is to count how many strings of length n can be formed under the following rules:
Each character is a lower case vowel ('a', 'e', 'i', 'o', 'u')
Each vowel 'a' may only be followed by an 'e'.
Each vowel 'e' may only be followed by an 'a' or an 'i'.
Each vowel 'i' may not be followed by another 'i'.
Each vowel 'o' may only be followed by an 'i' or a 'u'.
Each vowel 'u' may only be followed by an 'a'.
Since the answer may be too large, return it modulo 10^9 + 7.
*/

class Solution {
    public int countVowelPermutation(int n) {
        long a,e,i,o,u,an,en,in,on,un,mod=1000000000+7;
        a = e = i = o = u = 1;
        for(int j=2;j<=n;j++) {
            an = e;
            en = (a+i)%mod;
            in = (a+e+o+u)%mod;
            on = (i+u)%mod;
            un = a;
            a = an; e = en; i = in; o = on; u = un;
        }
        return (int)((a+e+i+o+u) % mod);
    }
}