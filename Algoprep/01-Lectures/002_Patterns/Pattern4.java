import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int NumberOfStars = n/2 + 1;
        int NumberOfSpaces = 1;
        for (int i =1; i <= n; i++) {
            // Printing stars
            for (int j = 1; j <= NumberOfStars; j++) {
                System.out.print("*");
            }

            //Priting spaces
            for (int k = 1; k <= NumberOfSpaces; k++) {
                System.out.print(" ");
            }

            // Printing stars after space
            for (int l = 1; l <= NumberOfStars; l++) {
                System.out.print("*");
            }

            // Preparation for next itteration 
            if (i <= n/2) {
                NumberOfStars = NumberOfStars - 1;
                NumberOfSpaces = NumberOfSpaces + 2;
            } else {
                NumberOfStars = NumberOfStars + 1;
                NumberOfSpaces = NumberOfSpaces - 2;
            }
            System.out.println();
        }
    }
}
