/*
A word or a sentence in some language is called a pangram if all the characters of the alphabet of this language appear in it at least once. Pangrams are often used to demonstrate fonts in printing or test the output devices.
You are given a string consisting of lowercase and uppercase Latin letters. Check whether this string is a pangram. We say that the string contains a letter of the Latin alphabet if this letter occurs in the string in uppercase or lowercase.
Input
The first line contains a single integer n (1 ≤ n ≤ 100) — the number of characters in the string.
The second line contains the string. The string consists only of uppercase and lowercase Latin letters.
Output
Output "YES", if the string is a pangram and "NO" otherwise.
*/

import java.util.*;

public class Pangram
{
    public static String isPangram(String s,int n)
    {
        int letters = 26,i;
        int freq[] = new int[letters];
        for(i=0;i<n;i++)
        {
            char c = s.charAt(i);
            int index = c<='Z'?c-'A':c-'a';
            freq[index]++;
        }
        for(i=0;i<letters;i++)
            if(freq[i]==0)
                return "NO";
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int n;
	    n = sc.nextInt();
	    String word = sc.next();
        System.out.println(isPangram(word,n));
        sc.close();
	}
}
