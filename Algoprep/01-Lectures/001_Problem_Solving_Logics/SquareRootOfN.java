import java.util.Scanner;
public class SquareRootOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to get its squareroot : ");
        int N = input.nextInt();
        int sqrt = 1;
        for (int i = 1; i*i <= N; i++) {
            sqrt = i;
        }
        System.out.println(sqrt);
    }
}
