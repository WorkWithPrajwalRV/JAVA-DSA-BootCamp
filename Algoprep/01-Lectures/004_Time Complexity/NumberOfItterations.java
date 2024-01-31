import java.util.Scanner;
public class NumberOfItterations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int action = 1;
        for (int i = 1; i <= n; i++) {
            action += i;
        }
        // Time complexity for above loop is O(n)

        for (int i = 1; i <= n; i++) {
            action += i;
        }
        for (int i = 1; i <= m; i++) {
            action += i;
        }
        // Time complexity for above loop is O(n+m)

        for (int i = 0; i <= 100; i++) {
            action += i;
        }
        // Time complexity for above loop is O(1)

        for (int i = 1; i*i <= n; i++) {
            action += i;
        }
        // Time complexity for above loop is O(sqrt(n))

        int i = n;
        while (i >= 1) {
            i = i/2;
        }
        // Time complexity for above loop is O(logn)

        int s = 0;
        for (int j = 0; j <= n; j= j*2) {
            s = s + i;
        }
        // No time complexity for infinite loop

        int a = 0;
        for (int j = 1; j <= n; j= j*2) {
            a = a + i;
        }
        // Time complexity for above loop is O(logn)

        for (int j = 1; j <= 10; j++) {
            for (int j2 = 1; j2 <= n; j2++) {
                s = s + 10;
            }
        }
        // Time complexity for above loop is O(n)

        for (int j = 1; j <= n; j++) {
            for (int j2 = 1; j2 <= j; j2++) {
                s = s + 10;
            }
        }
        // Time complexity for above loop is O(n^2)

        for (int j = 1; j <= Math.pow(2, n); j++) {
            System.out.println(j);
        }
        // Time complexity for above loop is O(2^n)

        for (int j = 1; j <= n; j++) {
            for (int j2 = 1; j2 <= Math.pow(2, j); j2++) {
                s = s + 10;
            }
        }
        // Time complexity for above loop is O(2^n) 
    }
}
