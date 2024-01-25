import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int NumberOfSpaces = 1;
        int NumberOfStars = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= NumberOfStars; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            for (int k = 1; k <= NumberOfSpaces; k++) {
                System.out.print(" ");
            }
            NumberOfSpaces = NumberOfSpaces + 1;
            NumberOfStars = NumberOfStars - 1;
            
        }
    }
}
