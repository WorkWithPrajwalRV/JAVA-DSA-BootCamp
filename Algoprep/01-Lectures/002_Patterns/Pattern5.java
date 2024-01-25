import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int NumberOfStars = 1;
        int CountOfNumber = 1;
        for (int i = 1; i <= n; i++) {
            // print numbers in place of stars
            for (int j = 1; j <= NumberOfStars; j++) {
                System.out.print(CountOfNumber);
                CountOfNumber++;
            }
            NumberOfStars = NumberOfStars + 1;
            System.out.println();
        }
    }
}
