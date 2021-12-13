/*
A soldier wants to buy w bananas in the shop. He has to pay k dollars for the first banana, 2k dollars for the second one and so on (in other words, he has to pay i·k dollars for the i-th banana).

He has n dollars. How many dollars does he have to borrow from his friend soldier to buy w bananas?

Input
The first line contains three positive integers k, n, w (1  ≤  k, w  ≤  1000, 0 ≤ n ≤ 109), the cost of the first banana, initial number of dollars the soldier has and number of bananas he wants.

Output
Output one integer — the amount of dollars that the soldier must borrow from his friend. If he doesn't have to borrow money, output 0.
*/
import java.util.*;

public class SoldierBanana
{
    public static int borrow(int k,int n,int w)
    {
        int i,res=0;
        for(i=1;i<=w;i++)
            res += i;
        res *= k;
        res = res-n>0?res-n:0;
        return res;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int k,n,w;
	    k = sc.nextInt();
	    n = sc.nextInt();
	    w = sc.nextInt();
	    System.out.println(borrow(k,n,w));
	}
}
