/*
Given a list of non-negative integers nums, arrange them such that they form the largest number.
Note: The result may be very large, so you need to return a string instead of an integer.
*/

class Solution {
    public String largestNumber(int[] nums) {
        int i,n=nums.length;
        List<String> numList = new ArrayList<>();
        for(i=0;i<n;i++)
            numList.add(String.valueOf(nums[i]));
        Comparator<String> cmp = new Comparator<>(){
            public int compare(String a,String b)
            {
                String case1 = a+b;
                String case2 = b+a;
                return case2.compareTo(case1);
            }
        };
        Collections.sort(numList,cmp);
        String res = "";
        for(String s:numList)
            res += s;
        if(res.charAt(0)=='0')
            res = "0";
        return res;
    }
}