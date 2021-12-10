/*
An integer n is a power of two, if there exists an integer x such that n == 2x.
*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1)
            return false;
        if(n%2==1)
        {
            if(n==1)
                return true;
            return false;
        }
        return isPowerOfTwo(n/2);
    }
}