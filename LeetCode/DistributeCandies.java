/*
Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor.
The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice.
Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.
*/

/*
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        int n = candyType.length;
        for(int i=0;i<n;i++)
            set.add(candyType[i]);
        return Math.min(n/2,set.size());
    }
}
*/

class Solution {
    public int distributeCandies(int[] candyType) {
        boolean set[] = new boolean[200001];
        int res = candyType.length/2, type = 0;
        for(int n: candyType)
        {
            n += 100000;
            if(!set[n])
                if(++type==res)
                    return res;
            set[n] = true;
        }
        return type;
    }
}