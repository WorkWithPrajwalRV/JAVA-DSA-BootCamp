import java.util.Scanner;

public class FibonacciSeeries {
    public static void main(String[] args) {
        System.out.println("Fibonacci Number seeries : ");
        // 7. To calculate Fibonacci Series up to n numbers.
        // Fibonacci number => 1, 1, 2, 3, 5, 8, 13 .....
        Scanner in = new Scanner(System.in);

        int n1 =0, n2 = 1, n3, count = in.nextInt();
        System.out.print(n1 + " " + n2); // Printing 0 and 1

        for(int i=2;i<=count;++i) {
            n3 = n1  + n2; 
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }    
    }
}
