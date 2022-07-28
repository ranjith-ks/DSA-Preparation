/*
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.
For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return the ordering of courses you should take to finish all courses. If there are many valid answers, return any of them. If it is impossible to finish all courses, return an empty array.
*/

class Solution {
    class Course {
        boolean visited = false;
        boolean tested = false;
        int num;
        List<Course> pre = new ArrayList<>();
        public Course(int i) {
            num = i;
        }
        public void add(Course c) {
            pre.add(c);
        }
    }
    private int N = 0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        Course[] course = new Course[numCourses];
        for(int i=0;i<numCourses;i++)
            course[i] = new Course(i);
        for(int i=0;i<prerequisites.length;i++)
            course[prerequisites[i][0]].add(course[prerequisites[i][1]]);
        for(int i=0;i<numCourses;i++)
            if(isCyclic(course[i],res))
                return new int[0];
        return res;
    }
    private boolean isCyclic(Course cur,int[] res) {
        if(cur.tested) return false;
        if(cur.visited) return true;
        cur.visited = true;
        for(Course c:cur.pre) 
            if(isCyclic(c,res))
                return true;
        cur.tested = true;
        res[N++] = cur.num;
        return false;
    }
}