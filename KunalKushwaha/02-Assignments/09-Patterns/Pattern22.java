import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int NumberOfStars = 1;
        for (int i = 1; i <= n; i++) {
            int num;
            if (i % 2 == 0) {
                num = 0;
            } else {
                num = 1;
            }
            for (int j = 1; j <= NumberOfStars; j++) {
                System.out.print(num + " ");
                num = 1 - num;
            }
            NumberOfStars++;
            System.out.println();
        }
    }
}
