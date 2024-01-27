import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int NumberOfSpace = n-1;
        int NumberOfStars = 1;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < NumberOfSpace; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < NumberOfStars; j++) {
                System.out.print(count + " ");
            }
            NumberOfSpace--;
            NumberOfStars++;
            System.out.println();
        }
    }
}
