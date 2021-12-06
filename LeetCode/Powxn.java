/*
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
*/

class Solution {
    public double myPow(double x, int n) {
        if(n==0)
            return 1;
        double r = myPow(x,n/2);
        if(n%2==0)
            return r*r;
        else
        {
            if(n<0)
                return r*r*(1/x);
            else
                return r*r*x;
        }
    }
}