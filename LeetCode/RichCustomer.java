/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int rows,columns,i,j,max=0,sum;
        rows = accounts.length;
        columns = accounts[0].length;
        for(i=0;i<rows;i++)
        {
            sum = 0;
            for(j=0;j<columns;j++)
            {
                sum += accounts[i][j];
            }
            if(max<sum)
                max = sum;
        }

        return max;
    }
}