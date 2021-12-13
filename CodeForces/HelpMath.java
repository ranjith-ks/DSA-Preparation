/*
Xenia the beginner mathematician is a third year student at elementary school. She is now learning the addition operation.

The teacher has written down the sum of multiple numbers. Pupils should calculate the sum. To make the calculation easier, the sum only contains numbers 1, 2 and 3. Still, that isn't enough for Xenia. She is only beginning to count, so she can calculate a sum only if the summands follow in non-decreasing order. For example, she can't calculate sum 1+3+2+1 but she can calculate sums 1+1+2 and 3+3.

You've got the sum that was written on the board. Rearrange the summans and print the sum in such a way that Xenia can calculate the sum.

Input
The first line contains a non-empty string s — the sum Xenia needs to count. String s contains no spaces. It only contains digits and characters "+". Besides, string s is a correct sum of numbers 1, 2 and 3. String s is at most 100 characters long.

Output
Print the new sum that Xenia can count.
*/

import java.util.*;

public class HelpMath
{
    public static void help(String s)
    {
        int i,one=0,two=0,three=0,n = s.length();
        char c;
        for(i=0;i<n;i++)
        {
            c = s.charAt(i);
            if(c=='1')
                one++;
            if(c=='2')
                two++;
            if(c=='3')
                three++;
        }
        if(one>0)
            System.out.print("1");
        for(i=1;i<one;i++)
            System.out.print("+1");
        if(two>0)
        {
            if(one>0)
                System.out.print("+");
            System.out.print("2");
        }
        for(i=1;i<two;i++)
            System.out.print("+2");
        if(three>0)
        {
            if(one>0 || two>0)
                System.out.print("+");
            System.out.print("3");
        }
        for(i=1;i<three;i++)
            System.out.print("+3");
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();

	    help(s);
	}
}
