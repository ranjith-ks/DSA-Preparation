/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
*/

/*
class Solution {
    public int addDigits(int num) {
        int res=0;
        while(num>0)
        {
            res += num%10;
            num /= 10;
        }
        return res<10?res:addDigits(res);
    }
}
*/

class Solution {
    public int addDigits(int num) {
        if(num==0)
            return 0;
        return num%9==0?9:num%9;
    }
}