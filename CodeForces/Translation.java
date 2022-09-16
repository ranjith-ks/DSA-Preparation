/*
The translation from the Berland language into the Birland language is not an easy task. Those languages are very similar: a berlandish word differs from a birlandish word with the same meaning a little: it is spelled (and pronounced) reversely. For example, a Berlandish word code corresponds to a Birlandish word edoc. However, it's easy to make a mistake during the «translation». Vasya translated word s from Berlandish into Birlandish as t. Help him: find out if he translated the word correctly.
Input
The first line contains word s, the second line contains word t. The words consist of lowercase Latin letters. The input data do not consist unnecessary spaces. The words are not empty and their lengths do not exceed 100 symbols.
Output
If the word t is a word s, written reversely, print YES, otherwise print NO.
*/

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String translatedWord = sc.next();

        System.out.println(isCorrectTranslation(word, translatedWord));

        sc.close();
    }

    private static String isCorrectTranslation(String word, String translatedWord) {
        int m = word.length(), n = translatedWord.length(),i,j;
        boolean isCorrect = true;
        for(i=0,j=n-1; m==n && i<n; i++,j--) {
            if(word.charAt(i)!=translatedWord.charAt(j)) {
                isCorrect = false;
                break;
            }
        }

        return (m==n&&isCorrect)? "YES" : "NO";
    }
}