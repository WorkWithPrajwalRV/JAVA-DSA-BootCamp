import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int NumberOfStars = 1;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= NumberOfStars; j++) {
                System.out.print(count);
                count++;
            }
            count = 1;
            NumberOfStars = NumberOfStars + 1;
            System.out.println();
        }
    }
}
