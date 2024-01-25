import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int NumberOfStars = 1;
        int NumberOfSpaces = n/2;
        for (int i = 1; i <= n; i++) {
            // printing number of spaces space first
            for (int j = 1; j <= NumberOfSpaces; j++) {
                System.out.print(" ");
            }

            // printing star
            for (int k = 1; k <= NumberOfStars; k++) {
                System.out.print("*");
            }

            // Preparation for next itteration
            if (i <= n/2) {
                NumberOfSpaces = NumberOfSpaces - 1;
                NumberOfStars = NumberOfStars + 2;
            } else {
                NumberOfSpaces = NumberOfSpaces + 1;
                NumberOfStars = NumberOfStars - 2;
            }
            System.out.println();

        }
    }
}
