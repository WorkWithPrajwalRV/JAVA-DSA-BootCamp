import java.util.Scanner;

public class FibonacciSeeries {
    public static void main(String[] args) {
        // Fibonacci Series upto n number In Java Programs
        Scanner input = new Scanner(System.in);
        System.out.println("Enter nth number to print fibonacci seeries upto nth range : ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        System.out.println(a + " " + b + " ");

        int temp = 0;
        int count = 2;
        while (count <= n) {
            temp = b;
            b = b + a;
            System.out.println(b + " ");
            a = temp;
        }
    }
}
