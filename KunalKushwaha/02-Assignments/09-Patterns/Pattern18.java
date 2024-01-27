import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int NumberOfSpace = 2;
        int NumberOfStars = (n-2)/2;

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= n-2; i++) {
            for (int j = 1; j <= NumberOfStars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= NumberOfSpace; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= NumberOfStars; k++) {
                System.out.print("*");
            }
            if (i < (n-1)/2) {
                NumberOfSpace = NumberOfSpace + 2;
                NumberOfStars = NumberOfStars - 1;
            } else if (i == (n-1)/2) {
                NumberOfSpace = NumberOfSpace;
                NumberOfStars = NumberOfStars;
            } else {
                NumberOfSpace = NumberOfSpace - 2;
                NumberOfStars = NumberOfStars + 1;
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        
    }
}
