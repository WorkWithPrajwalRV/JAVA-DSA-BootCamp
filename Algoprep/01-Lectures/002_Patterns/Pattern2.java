import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        // Triangle
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int NunmberOfStars = 1;
        
        //Number of rows :
        for (int i = 1; i <= n; i++) {
            // number of stars printing :
            for (int j = 1; j <= NunmberOfStars; j++) {
                System.out.print("*");
            }
            // next itteration preperation :
            NunmberOfStars++;
            System.out.println();
        }
        
    }
}
