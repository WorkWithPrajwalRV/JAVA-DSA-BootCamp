import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int NumberOfSpace = 5;
        int NumberOfStars = 1;
        for (int i = 1; i <= n; i++) {
            // Printing spacees
            for (int j = 1; j <= NumberOfSpace; j++) {
                System.out.print(" ");
            }

            // Printing stars
            for (int k = 1; k <= NumberOfStars; k++) {
                System.out.print("*");
            }
            NumberOfSpace = NumberOfSpace - 1;
            NumberOfStars = NumberOfStars + 1;
            System.out.println();
        }
    }
}
