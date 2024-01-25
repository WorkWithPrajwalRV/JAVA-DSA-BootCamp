import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int NumberOfStars = 5;
        int NumberOfSpace = 1;

        for (int i = 1; i <= n; i++) {
            // Printing stars first
            for (int j = 1; j <= NumberOfStars; j++) {
                System.out.print("* ");
            }
            System.out.println();
            // Printing spaces
            for (int k = 1; k <= NumberOfSpace; k++) {
                System.out.print(" ");
            }
            NumberOfStars = NumberOfStars - 1;
            NumberOfSpace = NumberOfSpace + 1;
        }
        System.out.println();
        NumberOfSpace = 4;
        NumberOfStars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= NumberOfSpace; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= NumberOfStars; k++) {
                System.out.print("* ");
            }
            NumberOfSpace = NumberOfSpace - 1;
            NumberOfStars = NumberOfStars + 1;
            System.out.println();
        }
    }
}
