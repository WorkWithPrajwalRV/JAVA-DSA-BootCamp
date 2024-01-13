import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        // 5. Take 2 numbers as input and print the largest number.
        Scanner in = new Scanner(System.in);
        System.out.println("Input two number to find which one is largest : ");
        System.out.print("Input num1 : ");
        int num1 = in.nextInt();
        System.out.print("Input num2 : ");
        int num2 = in.nextInt();

        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        System.out.println("Largest between " + num1 + " & " + num2 + " largest is " + largest);
    }
}
