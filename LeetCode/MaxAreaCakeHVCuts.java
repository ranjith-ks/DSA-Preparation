/*
You are given a rectangular cake of size h x w and two arrays of integers horizontalCuts and verticalCuts where:
horizontalCuts[i] is the distance from the top of the rectangular cake to the ith horizontal cut and similarly, and
verticalCuts[j] is the distance from the left of the rectangular cake to the jth vertical cut.
Return the maximum area of a piece of cake after you cut at each horizontal and vertical position provided in the arrays horizontalCuts and verticalCuts. Since the answer can be a large number, return this modulo 109 + 7.
*/

class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int m = horizontalCuts.length,n = verticalCuts.length;
        int maxHeight = Math.max(h-horizontalCuts[m-1],horizontalCuts[0]);
        int maxWidth = Math.max(w-verticalCuts[n-1],verticalCuts[0]);
        for(int i=1;i<m;i++)
            maxHeight = Math.max(maxHeight,horizontalCuts[i]-horizontalCuts[i-1]);
        for(int i=1;i<n;i++)
            maxWidth = Math.max(maxWidth,verticalCuts[i]-verticalCuts[i-1]);
        return (int)((long)maxHeight*(long)maxWidth%1000000007L);
    }
}