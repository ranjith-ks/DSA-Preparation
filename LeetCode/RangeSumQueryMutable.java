/*
Given an integer array nums, handle multiple queries of the following types:
Update the value of an element in nums.
Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:
NumArray(int[] nums) Initializes the object with the integer array nums.
void update(int index, int val) Updates the value of nums[index] to be val.
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
*/

class NumArray {
    private int[] BIT;
    private int[] nums;
    private int n;

    public NumArray(int[] nums) {
        this.nums = nums;
        n = nums.length;
        BIT = new int[n+1];
        for(int i=0;i<n;i++)
            init(i,nums[i]);
    }
    
    public void update(int index, int val) {
        int diff = val - nums[index];
        nums[index] = val;
        init(index,diff);
    }
    
    public int sumRange(int left, int right) {
        return getSum(right) - getSum(left-1);
    }
    
    private void init(int i,int val) {
        for(i++;i<=n;i+= i & (-i))
            BIT[i] += val;
    }
    
    private int getSum(int i) {
        int sum = 0;
        for(i++;i>0;i-= i & (-i))
            sum += BIT[i];
        return sum;
    }
}