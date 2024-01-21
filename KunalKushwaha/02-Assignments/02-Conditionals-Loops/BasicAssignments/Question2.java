import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Q : Input a number and print all the factors of that number (use loops).
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to check all of its possible factors : ");
        int n = input.nextInt();

        int count = 1;
        while (count <= n) {
            if (n % count == 0) {
                System.out.print(count + " ");
                count++;
            } else {
                count++;
            }
        }
    }
}
