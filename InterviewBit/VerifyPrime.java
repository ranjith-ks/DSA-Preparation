/*
Given a number N, verify if N is prime or not.
Return 1 if N is prime, else return 0.
Example :
Input : 7
Output : True
*/

public class Solution {
    public int isPrime(int n) {
        if(n<2)
            return 0;
        int i,ul = (int)Math.sqrt(n);
        for(i=2;i<=ul;i++)
        {
            if(n%i==0)
                return 0;
        }
        return 1;
    }
}
