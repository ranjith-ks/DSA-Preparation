import java.util.Scanner;

public class UFMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        add(num1, num2);

        sc.close();
    }
    private static void add(String a, String b) {
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == b.charAt(i))
                System.out.print("0");
            else
                System.out.print("1");
        }
    }
}
