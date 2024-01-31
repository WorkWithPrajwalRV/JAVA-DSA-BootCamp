import java.util.Scanner;

    public class FactorialFunction {
    public static void main(String[] args) {
        System.out.println("Give n value to find it's Factorial value : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ncr = factorial(n);
        System.out.println(ncr);


    }

    public static int factorial(int n) {
        int nFactorial = 1;
        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }
        return nFactorial;
    }
} 
