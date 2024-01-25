import java.util.Scanner;

public class PatternSolvingSteps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // Step 1 -> Number of rows
        for (int row = 1; row <= n; row++) {
            // Step 2 -> number of colums and its type
            for (int col= 1; col <= row; col++) {
                System.out.print("*");
            }
            // When one row is printed we need to move to next line
            System.out.println();
        }
    }
}
