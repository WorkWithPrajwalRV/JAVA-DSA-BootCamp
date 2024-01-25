import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int NumberOfSpace = 1;
        int NumberOfStars = 5;
        for (int i = 1; i <= n; i++) {
            // Printing stars
            for (int j = 1; j <= NumberOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
            // Printing spacees
            for (int k = 1; k <= NumberOfSpace; k++) {
                System.out.print(" ");
            }
            NumberOfSpace = NumberOfSpace + 1;
            NumberOfStars = NumberOfStars - 1;
            
        }
    }
}
