import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int NumberOfStars = n-1;
        int NumberOfSpace = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= NumberOfStars; j++) {
                System.out.print("*");
                for (int k = 1; k <= NumberOfSpace; k++) {
                    System.out.print(" ");
                }
            }
            if (i < n-1) {
                NumberOfSpace = n/2;
                NumberOfStars = 2;
            } else {
                NumberOfStars = n-1;
                NumberOfSpace = 0;
            }
            System.out.println();
        }
    }
}
