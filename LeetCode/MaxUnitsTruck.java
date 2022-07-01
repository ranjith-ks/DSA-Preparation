/*
You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:
numberOfBoxesi is the number of boxes of type i.
numberOfUnitsPerBoxi is the number of units in each box of the type i.
You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck. You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.
Return the maximum total number of units that can be put on the truck.
*/

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[] count = new int[1001];
        for(int[] box: boxTypes)
            count[box[1]] += box[0];
        int res = 0;
        for(int i = 1000; i>-1 && truckSize>0;i--) {
            if(count[i]>0) {
                int minFit = Math.min(count[i],truckSize);
                res += minFit*i;
                truckSize -= count[i];
            }
        }
        return res;
    }
}