/*
The following code is supposed to rotate the array A by B positions.
So, for example,
A : [1 2 3 4 5 6]
B : 1
The output :
[2 3 4 5 6 1]
However, there is a small bug in the problem. Fix the bug and submit the problem.
*/

public class Solution {
	public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        B = B % A.size();
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < A.size()-B; i++) {
			ret.add(A.get(i + B));
		}
        for (int i=0;i<B;i++)
            ret.add(A.get(i));
		return ret;
	}
}
