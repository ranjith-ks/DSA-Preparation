/*
A digit string is good if the digits (0-indexed) at even indices are even and the digits at odd indices are prime (2, 3, 5, or 7).

For example, "2582" is good because the digits (2 and 8) at even positions are even and the digits (5 and 2) at odd positions are prime. However, "3245" is not good because 3 is at an even index but is not even.
Given an integer n, return the total number of good digit strings of length n. Since the answer may be large, return it modulo 109 + 7.

A digit string is a string consisting of digits 0 through 9 that may contain leading zeros.
*/

class Solution {
    public static long pow(long a,long b,long mod)
    {
        if(b==0)
            return 1;
        long r = pow(a,b/2,mod)%mod;
        if(b%2==0)
            return (r*r)%mod;
        else
        {
            r = (r*r)%mod;
            return (a*r)%mod;
        }
    }
    public int countGoodNumbers(long n) {
        long odd,even,mod,res;
        odd = n/2;
        even = (n+1)/2;
        mod = 1000000007;
        res = (( pow(5,even,mod) * pow(4,odd,mod) )%mod);

        return (int)res;
    }
}