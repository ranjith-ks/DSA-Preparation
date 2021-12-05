/*
Duff is in love with lovely numbers! A positive integer x is called lovely if and only if there is no such positive integer a > 1 such that a2 is a divisor of x.


Malek has a number store! In his store, he has only divisors of positive integer n (and he has all of them). As a birthday present, Malek wants to give her a lovely number from his store. He wants this number to be as big as possible.

Malek always had issues in math, so he asked for your help. Please tell him what is the biggest lovely number in his store.

Input
The first and only line of input contains one integer, n (1 ≤ n ≤ 1012).

Output
Print the answer in one line.
*/

import java.util.*;

public class DuffLove{
    public static long love(long n)
    {
        long i;
        for(i=2;i*i<=n;i++)
        {
            if(n%(i*i)==0)
            {
                n /= i;
                i = 1;
            }
        }
        return n;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        long n,res;
        n = s.nextLong();
        res = love(n);
        System.out.println(res);
    }
}