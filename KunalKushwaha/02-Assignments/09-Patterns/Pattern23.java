import java.util.Scanner;

public abstract class Pattern23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int numberOfSpace = n/2 + 1;
        int numberOfStars = 2;
        int numberOfSpaceAfterStar = 3;
        int numberOfStarAfterSpace = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= numberOfSpace; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= numberOfStars; j++) {
                System.out.print("* ");
                for (int j2 = 1; j2 <= numberOfSpaceAfterStar; j2++) {
                    System.out.print(" ");
                }
            }
            if (i < n/2+1){
                numberOfStars+=2;
                numberOfSpace--;
                numberOfSpaceAfterStar-=2;
            } else {
                numberOfStars--;
                numberOfSpace--;
                numberOfSpaceAfterStar+=3;
            }
            System.out.println();

        }
    }
}
