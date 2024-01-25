import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int NumberOfStars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=NumberOfStars; j++) {
                System.out.print("*");
            }
            if (i <= n/2) {
                NumberOfStars = NumberOfStars + 1;
            } else {
                NumberOfStars = NumberOfStars - 1;
            }
            System.out.println();
        }
    }
}
