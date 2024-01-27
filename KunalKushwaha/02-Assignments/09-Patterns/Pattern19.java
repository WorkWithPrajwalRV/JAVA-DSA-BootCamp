import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int NumberOfStars = 1;
        int NumberOfSpace = n-2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= NumberOfStars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= NumberOfSpace; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= NumberOfStars; j++) {
                System.out.print("*");
            }
            if (i < n/2) {
                NumberOfStars++;
                NumberOfSpace-=2;
            } else {
                NumberOfStars--;
                NumberOfSpace+=2;
            }
            System.out.println();
        }   
    }
}
