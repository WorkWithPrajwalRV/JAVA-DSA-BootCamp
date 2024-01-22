import java.util.Scanner;

public class CountingFactorsAndPrimeNumberLogic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check its possible factors : ");
        int N = input.nextInt();
        int count = 0;

        for (int i = 1; i*i <= N; i++) {
            if (N % i == 0) {
                if (i != N/i) {
                    count = count + 2;
                } else {
                    count = count + 1;
                }
            }
        }
        System.out.println("Total number of factors is = " + count);

        // To Check a number is prime number or not prime number :
        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
