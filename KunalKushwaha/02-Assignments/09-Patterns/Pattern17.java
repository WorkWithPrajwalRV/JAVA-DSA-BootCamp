import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int NumberOfSpace = n/2;
        int NumberOfStars = 1;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < NumberOfSpace; j++) {
                System.out.print(" ");
            }
            if (i <= n/2 + 1) {
                count = i;
            } else {
                count = n - i + 1;
            }
            for (int j = 0; j < NumberOfStars; j++) {
                System.out.print(count);
                if (j < NumberOfStars/2) {
                    count--;
                }else {
                    count++;
                }
            }
            if (i <= n/2) {
                NumberOfSpace--;
                NumberOfStars += 2;
            } else {
                NumberOfSpace++;
                NumberOfStars -= 2;
            }
            System.out.println();
        }
    }
}
