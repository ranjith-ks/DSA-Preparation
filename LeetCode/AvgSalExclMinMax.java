/*
You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.
*/

class Solution {
    public double average(int[] salary) {
        int max = salary[0], min = salary[0],n = 0;
        double total = 0;
        for(int i:salary)
        {
            max = Math.max(max,i);
            min = Math.min(min,i);
            total += i;
            n++;
        }
        total -= (min+max);
        return total/(n-2);
    }
}