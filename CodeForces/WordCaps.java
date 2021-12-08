/*
Capitalization is writing a word with its first letter as a capital letter. Your task is to capitalize the given word.

Note, that during capitalization all the letters except the first one remains unchanged.

Input
A single line contains a non-empty word. This word consists of lowercase and uppercase English letters. The length of the word will not exceed 103.

Output
Output the given word after capitalization.
*/

import java.util.*;

public class WordCaps
{
    public static void capitalize(String w)
    {
        int i;
        i = w.charAt(0) - 'a';
        if(i<0)
            i = w.charAt(0) - 'A';
        char f = (char)('A' + i);
        System.out.print(f);
        for(i=1;i<w.length();i++)
            System.out.print(w.charAt(i));
        System.out.println();
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		capitalize(word);
	}
}
