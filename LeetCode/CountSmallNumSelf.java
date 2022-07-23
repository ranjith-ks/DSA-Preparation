/*
You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].
*/

class Solution {
    private class OrigIndexArr {
        int val;
        int idx;
        public OrigIndexArr(int val,int idx) {
            this.val = val;
            this.idx = idx;
        }
    }
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums==null || nums.length==0)
            return res;
        int n = nums.length;
        int[] result = new int[n];
        
        OrigIndexArr[] newNums = new OrigIndexArr[n];
        for(int i=0;i<n;i++)
            newNums[i] = new OrigIndexArr(nums[i],i);
        
        mergeSortCount(newNums,0,n-1,result);
        
        for(int i:result)
            res.add(i);
        return res;
    }
    private void mergeSortCount(OrigIndexArr[] a,int s,int e,int[] res) {
        if(s>=e)
            return;
        int mid = (s+e)/2;
        mergeSortCount(a,s,mid,res);
        mergeSortCount(a,mid+1,e,res);
        
        int left = s,right = mid+1,count = 0;
        LinkedList<OrigIndexArr> ll = new LinkedList<>();
        while(left<mid+1 && right<=e) {
            if(a[left].val>a[right].val) {
                count++;
                ll.add(a[right]);
                right++;
            }
            else {
                res[a[left].idx] += count;
                ll.add(a[left]);
                left++;
            }
        }
        
        while(left<mid+1) {
            res[a[left].idx] += count;
            ll.add(a[left]);
            left++;
        }
        
        while(right<=e) {
            ll.add(a[right]);
            right++;
        }
        
        int pos = s;
        for(OrigIndexArr i:ll) {
            a[pos] = i;
            pos++;
        }
    }
}