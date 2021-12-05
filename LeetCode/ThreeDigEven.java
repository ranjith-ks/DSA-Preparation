/*
You are given an integer array digits, where each element is a digit. The array may contain duplicates.

You need to find all the unique integers that follow the given requirements:

The integer consists of the concatenation of three elements from digits in any arbitrary order.
The integer does not have leading zeros.
The integer is even.
For example, if the given digits were [1, 2, 3], integers 132 and 312 follow the requirements.

Return a sorted array of the unique integers.
*/

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> l = new HashSet<>();
        int n,i,j,k,num=0;
        n = digits.length;
        for(i=0;i<n;i++)
        {
            if(digits[i]==0)
                continue;
            for(j=0;j<n;j++)
            {
                if(i==j)
                    continue;
                for(k=0;k<n;k++)
                {
                    if(i==k || k==j)
                        continue;
                    if(digits[k]%2==0)
                    {
                        num = digits[i]*100 + digits[j]*10 + digits[k];
                        l.add(num);
                    }
                }
            }
        }
        List<Integer> r = new ArrayList<>(l);
        Collections.sort(r);
        int res[] = new int[l.size()];
        j = 0;
        for(int p: r)
            res[j++] = p;
        return res;
    }
}