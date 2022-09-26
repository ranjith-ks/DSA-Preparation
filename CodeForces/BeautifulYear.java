/*
It seems like the year of 2013 came only yesterday. Do you know a curious fact? The year of 2013 is the first year after the old 1987 with only distinct digits.
Now you are suggested to solve the following problem: given a year number, find the minimum year number which is strictly larger than the given one and has only distinct digits.
Input
The single line contains integer y (1000 ≤ y ≤ 9000) — the year number.
Output
Print a single integer — the minimum year number that is strictly larger than y and all it's digits are distinct. It is guaranteed that the answer exists.
*/

import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(nextBeautifulYear(year+1));

        sc.close();
    }
    private static int nextBeautifulYear(int year) {
        boolean containsDistinctDigits = false;
        for(;year<9999;year++) {
            containsDistinctDigits = distinctDigits(year);
            if(containsDistinctDigits)
                return year;
        }
        return -1;
    }
    private static boolean distinctDigits(int n) {
        int count = 0;
        int[] freq = new int[10];
        while(n>0) {
            int rem = n%10;
            freq[rem]++;
            n /= 10;
        }
        for(int i=0;i<10;i++)
            if(freq[i]==1)
                count++;
        return count==4;
    }
}