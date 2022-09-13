import java.util.Scanner;

public class QueueAtSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String queue = sc.next();
        interchangeQueue(n,t,queue.toCharArray());

        sc.close();
    }
    private static void interchangeQueue(int n, int t,char[] queue) {
        for(int i=0;i<t;i++) {
            for(int j=0;j<n-1;j++) {
                if(queue[j]=='B' && queue[j+1]=='G') {
                    queue[j] = 'G';
                    queue[j+1] = 'B';
                    j++;
                }
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(queue[i]+"");
    }
}
