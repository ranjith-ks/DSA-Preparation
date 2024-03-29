/*
You are given an array routes representing bus routes where routes[i] is a bus route that the ith bus repeats forever.
For example, if routes[0] = [1, 5, 7], this means that the 0th bus travels in the sequence 1 -> 5 -> 7 -> 1 -> 5 -> 7 -> 1 -> ... forever.
You will start at the bus stop source (You are not on any bus initially), and you want to go to the bus stop target. You can travel between bus stops by buses only.
Return the least number of buses you must take to travel from source to target. Return -1 if it is not possible.
*/

class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if(source==target)
            return 0;
        Set<Integer> used = new HashSet<>();
        Map<Integer,List<Integer>> hm = new HashMap<>();
        for(int i=0;i<routes.length;i++)
            for(int j=0;j<routes[i].length;j++) {
                hm.putIfAbsent(routes[i][j],new LinkedList<>());
                hm.get(routes[i][j]).add(i);
            }
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        int r = 1;
        while(!q.isEmpty()) {
            for(int i = q.size();i>0;i--)
                for(int bus:hm.get(q.poll()))
                    if(used.add(bus))
                        for(int j=0;j<routes[bus].length;j++) {
                            if(routes[bus][j]==target)
                                return r;
                            else
                                q.offer(routes[bus][j]);
                        }
            r++;            
        }
        return -1;
    }
}