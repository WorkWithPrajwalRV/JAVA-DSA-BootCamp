import java.util.Scanner;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int NumberOfSpace = N/2;
        int NumberOfStars = 2;
        int NumberOfSpaceAfterStars = 1;
        int NumberOfFirstStars = 1;

        for (int m = 1; m <= NumberOfSpace + 1; m++) {
            System.out.print(" ");
        }
        for (int n = 1; n <= NumberOfFirstStars; n++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= N; i++) {
            //Printing spaces
            for (int j = 1; j <= NumberOfSpace ; j++) {
                System.out.print(" ");
            }
            //Printing stars
            for (int k = 1; k <= NumberOfStars; k++) {
                System.out.print("*");
                for (int l = 1; l <= NumberOfSpaceAfterStars; l++) {
                    System.out.print(" ");
                }
            }
            if (i <= (((N-2)/2) + 1)) {
                NumberOfSpace = NumberOfSpace - 1;
                NumberOfSpaceAfterStars = NumberOfSpaceAfterStars + 2;
            } else {
                NumberOfSpace = NumberOfSpace + 1;
                NumberOfSpaceAfterStars = NumberOfSpaceAfterStars - 2;
            }
            // Printing space after stars
            System.out.println();
        }
        for (int o = 1; o <= NumberOfSpace; o++) {
            System.out.print(" ");
        }
        for (int p = 1; p <= NumberOfFirstStars; p++) {
            System.out.print("*");
        }
    }
}
