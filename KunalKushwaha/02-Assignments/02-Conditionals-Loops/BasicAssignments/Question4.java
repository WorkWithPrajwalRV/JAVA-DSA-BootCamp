import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        // Q : Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter as many numbers you want to get maximum number between those numbers ");
        int max = 0;
        while (true) {
            System.out.print("Num : ");
            int n = input.nextInt();
            if (n > max) {
                max = n;
            }
            if (n == 0) {
                break;
            }
        }
        System.out.println("Maximum of all entered numbers is " + max);
    }
}
