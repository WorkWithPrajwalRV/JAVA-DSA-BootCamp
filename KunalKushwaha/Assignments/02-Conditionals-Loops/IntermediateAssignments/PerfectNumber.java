package IntermediateAssignments;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        /* For example, let's take the number 28:
        The divisors of 28 are 1, 2, 4, 7, 14, and 28.
        Excluding 28, the sum of the divisors is => 1 + 2 +4 + 7 + 14 = 28 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check weather it is perfect Number or not : ");
        System.out.print("Enter a Number : ");
        int n = input.nextInt();
        
        int sum = 0;
        for (int i = 1;i < n; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("Awesome " + n + " is a Perfect Number");
        } else {
            System.out.println("Oop's sorry " + n + " is not a Perfect Number");
        }
    }
}
