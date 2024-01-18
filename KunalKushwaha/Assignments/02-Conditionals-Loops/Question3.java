import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Q : Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter as many numbers you want to the sum of all those numbers ");
        int sum = 0;
        while (true) {
            System.out.print("Num : ");
            int n = input.nextInt();
            sum += n;
            if (n == 0) {
                break;
            }
        }
        System.out.println("Sum of all numbers is = " + sum);
    }
}
