/*
There is a game called "I Wanna Be the Guy", consisting of n levels. Little X and his friend Little Y are addicted to the game. Each of them wants to pass the whole game.
Little X can pass only p levels of the game. And Little Y can pass only q levels of the game. You are given the indices of levels Little X can pass and the indices of levels Little Y can pass. Will Little X and Little Y pass the whole game, if they cooperate each other?
Input
The first line contains a single integer n (1 ≤  n ≤ 100).
The next line contains an integer p (0 ≤ p ≤ n) at first, then follows p distinct integers a1, a2, ..., ap (1 ≤ ai ≤ n). These integers denote the indices of levels Little X can pass. The next line contains the levels Little Y can pass in the same format. It's assumed that levels are numbered from 1 to n.
Output
If they can pass all the levels, print "I become the guy.". If it's impossible, print "Oh, my keyboard!" (without the quotes).
*/

import java.util.*;

public class TheGuy
{
    public static boolean isPass(int[] a,int[] b,int n)
    {
        Set<Integer> hs = new HashSet<>();
        for(int i:a)
            hs.add(i);
        for(int i:b)
            hs.add(i);
        return n==hs.size();
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int i,n,p,q;
	    n = sc.nextInt();
	    p = sc.nextInt();
	    int X[] = new int[p];
	    for(i=0;i<p;i++)
	        X[i] = sc.nextInt();
	    q = sc.nextInt();
	    int Y[] = new int[q];
	    for(i=0;i<q;i++)
	        Y[i] = sc.nextInt();
	    if(isPass(X,Y,n))
	        System.out.println("I become the guy.");
	    else
	        System.out.println("Oh, my keyboard!");
	}
}
