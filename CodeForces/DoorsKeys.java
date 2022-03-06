/*
The knight is standing in front of a long and narrow hallway. A princess is waiting at the end of it.
In a hallway there are three doors: a red door, a green door and a blue door. The doors are placed one after another, however, possibly in a different order. To proceed to the next door, the knight must first open the door before.
Each door can be only opened with a key of the corresponding color. So three keys: a red key, a green key and a blue key — are also placed somewhere in the hallway. To open the door, the knight should first pick up the key of its color.
The knight has a map of the hallway. It can be transcribed as a string, consisting of six characters:
R, G, B — denoting red, green and blue doors, respectively;
r, g, b — denoting red, green and blue keys, respectively.
Each of these six characters appears in the string exactly once.
The knight is standing at the beginning of the hallway — on the left on the map.
Given a map of the hallway, determine if the knight can open all doors and meet the princess at the end of the hallway.
Input
The first line contains a single integer t (1≤t≤720) — the number of testcases.
Each testcase consists of a single string. Each character is one of R, G, B (for the doors), r, g, b (for the keys), and each of them appears exactly once.
Output
For each testcase, print YES if the knight can open all doors. Otherwise, print NO.
*/

import java.util.*;

public class DoorsKeys
{
    public static String openAllDoors(String s,int n)
    {
        boolean r,g,b;
        r = g = b = false;
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(c=='r') r = true;
            else if(c=='g') g = true;
            else if(c=='b') b = true;
            else
            {
                if(c=='R')
                    if(!r) return "NO";
                if(c=='G')
                    if(!g) return "NO";
                if(c=='B')
                    if(!b) return "NO";
            }
        }
        return "YES";
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int test = sc.nextInt();
	    while(test-->0)
	    {
	        String s = sc.next();
	        System.out.println(openAllDoors(s,s.length()));
	    }
        sc.close();
	}
}
