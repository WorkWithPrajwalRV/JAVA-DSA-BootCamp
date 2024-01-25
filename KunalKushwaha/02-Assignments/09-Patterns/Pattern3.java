import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int NumberOfStars = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= NumberOfStars; j++) {
                System.out.print("*");
            }
            NumberOfStars = NumberOfStars - 1;
            System.out.println();
        }
    }
}
