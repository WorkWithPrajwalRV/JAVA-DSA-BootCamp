package IntermediateAssignments;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Write a program to print the sum of negative numbers, 
        //                              sum of positive even numbers and the 
        //                              sum of positive odd numbers 
        // from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter mix inputs of negative, positive even, positive odd numbers and enter 0 to stop inputting and get their sum ");

        int sum = 0;
        while (true) {
            int N = input.nextInt();
            if (N < 0 || N > 0 && N % 2 == 1 || N > 0 && N % 2 == 0) {
                sum += N;
            }
            if (N == 0) {
                break;
            }
        }
        System.out.println(sum);
    }
}
