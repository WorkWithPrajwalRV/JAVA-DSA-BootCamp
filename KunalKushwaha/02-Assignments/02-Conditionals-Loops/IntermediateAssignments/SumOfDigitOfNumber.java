package IntermediateAssignments;

import java.util.Scanner;

public class SumOfDigitOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to get sum of its digits : ");
        int number = input.nextInt();

        int OriginalNumber = number;
        int sumOfDigits = 0;
        while (OriginalNumber != 0) {
            int digits = OriginalNumber % 10;
            sumOfDigits += digits;
            OriginalNumber /= 10;
        }
        System.out.println("sum of its digits = " + sumOfDigits);
    }
}
