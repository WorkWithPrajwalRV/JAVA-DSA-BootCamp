import java.util.Scanner;
public class Pattern13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int NumberOfSpace = N-1;
        int NumberOfStars = 2;
        int NumberOfSpaceAfterStars = 1;
        int NumberOfFirstStars = 1;
        int totalstars = 0;
        for (int m = 1; m <= NumberOfSpace + 1; m++) {
            System.out.print(" ");
        }
        for (int n = 1; n <= NumberOfFirstStars; n++) {
            System.out.print("*");
            totalstars++;
        }
        System.out.println();
        for (int i = 1; i <= N-1; i++) {
            //Printing spaces
            for (int j = 1; j <= NumberOfSpace; j++) {
                System.out.print(" ");
            }
            //Printing stars
            for (int k = 1; k <= NumberOfStars; k++) {
                System.out.print("*");
                totalstars++;
                for (int l = 1; l <= NumberOfSpaceAfterStars; l++) {
                    System.out.print(" ");
                }
            }
            NumberOfSpace = NumberOfSpace - 1;
            NumberOfSpaceAfterStars = NumberOfSpaceAfterStars + 2;
            // Printing space after stars
            System.out.println();
        }
        for (int o = 1; o <= totalstars + 2; o++) {
            System.out.print("*");
        }
    }
}
