import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // for (int row = 0; row <= n; row++) {
        //     for (int col = 0; col < row; col++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        int NumberOfStars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= NumberOfStars; j++) {
                System.out.println("*");
            }
            NumberOfStars = NumberOfStars + 1;
            System.out.println();
        }
    }
}
