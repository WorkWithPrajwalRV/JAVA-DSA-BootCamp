import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int NumberOfStars = 2;
        int NumberOfSpace = 1;
        int NumberOfSpaceAfterStars = 5;
        int NumberOfFirstStars = 1;
        //Printing first row stars
        for (int m = 1; m <= 9; m++) {
            System.out.print("*");
        }
        System.out.println();
        // operations from 2 nd row
        for (int i = 2; i <= n-1; i++) {
            for (int j = 1; j <= NumberOfSpace; j++) {
                System.out.print(" ");
            }
            //  Printing stars
            for (int k = 1; k <= NumberOfStars; k++) {
                System.out.print("*");
                 for (int l = 1; l <= NumberOfSpaceAfterStars; l++) {
                     System.out.print(" ");
                 }
            }
            // printing space after stars
            NumberOfStars = 2;
            NumberOfSpace = NumberOfSpace + 1;
            NumberOfSpaceAfterStars = NumberOfSpaceAfterStars - 2;
            System.out.println();
        }
        for (int i = 1; i <= NumberOfFirstStars; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
