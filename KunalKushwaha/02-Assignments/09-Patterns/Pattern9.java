import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int NumberOfSpace = 1;
        int NumberOfStars = 9;
        for (int i = 1; i <= n; i++) {
            // Printting stars 
            for (int J = 1; J <= NumberOfStars; J++) {
                System.out.print("*");
            }
            System.out.println();
            // Printing Space
            for (int K = 1; K <= NumberOfSpace; K++) {
                System.out.print(" ");
            }
            NumberOfSpace = NumberOfSpace + 1;
            NumberOfStars = NumberOfStars - 2;
            
        }
    }
}
