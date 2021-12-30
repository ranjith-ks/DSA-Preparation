/*
Given an array nums of integers, return how many of them contain an even number of digits.
*/

/*
class Solution {
    public int findNumbers(int[] nums) {
        int i,count=0;
        for(int num: nums)
        {
            i = 0;
            while(num>0)
            {
                num /= 10;
                i++;
            }
            if(i%2==0)
                count++;
        }
        return count;
    }
}
*/

class Solution {
    public int findNumbers(int[] nums) {
        int i,count=0;
        for(int n:nums)
        {
            if( (n>9&&n<100) || (n>999)&&(n<10000) || n==100000)
                count++;
        }
        return count;
    }
}