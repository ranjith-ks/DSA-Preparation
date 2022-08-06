/*
We are given an array asteroids of integers representing asteroids in a row.
For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
*/

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        for (int asteroid : asteroids) {
            if (asteroid < 0) {
                while (!stk.isEmpty() && stk.peek() > 0 && asteroid < 0) {
                    int prevAsteroid = stk.pop();
                    if (Math.abs(asteroid) == prevAsteroid)
                        asteroid = 0;
                    else
                        asteroid = Math.abs(asteroid) > prevAsteroid ? asteroid : prevAsteroid;
                }
            }
            if (asteroid != 0)
                stk.push(asteroid);
        }
        int[] res = new int[stk.size()];
        int i=0;
        for(int n:stk)
            res[i++] = n;
        return res;
   
    }
}