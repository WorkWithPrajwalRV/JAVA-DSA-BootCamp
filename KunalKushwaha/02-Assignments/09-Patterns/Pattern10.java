import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int NumberOfSpaces = 4;
        int NumberOfStars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= NumberOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= NumberOfStars; k++) {
                System.out.print("*" + " ");
            }
            NumberOfSpaces = NumberOfSpaces - 1;
            NumberOfStars = NumberOfStars + 1;
            System.out.println();
        }
    }
}
