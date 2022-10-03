import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mixtures = new int[n];
        for(int i = 0; i < n; i++)
            mixtures[i] = sc.nextInt();
        System.out.println(volumeFraction(mixtures,n));

        sc.close();
    }
    private static double volumeFraction(int[] mixtures,int n) {
        int sum = 0;
        for(int i: mixtures)
            sum += i;
        return ((double)sum / (double)n);
    }
}
