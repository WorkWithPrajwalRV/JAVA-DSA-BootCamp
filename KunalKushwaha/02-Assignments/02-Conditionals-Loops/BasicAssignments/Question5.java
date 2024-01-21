import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // Addition Of Two Numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers to get their sum : ");
        System.out.print("Num1 :");
        int num1 = input.nextInt();
        System.out.print("Num2 :");
        int num2 = input.nextInt();
        int sum = num1 + num2;

        System.out.println("Sum of " + " " + num1 + " + " + num2 + " is = " + sum);
    }
}
