package IntermediateAssignments;

import java.util.Scanner;

public class PalindromeOfNumber {
    public static void main(String[] args) {
        // Find if a number is palindrome or not :
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int OriginalNumber = number;

        int rev = 0;
        while (OriginalNumber != 0) {
            int lastdigit = OriginalNumber % 10;
            rev = rev * 10 + lastdigit;
            OriginalNumber /= 10;
        }
        if (rev == number) {
            System.out.println(number + " is a Palindrome number");
        } else {
            System.out.println(number + " is not a palindrome number");
        }
    }
}
