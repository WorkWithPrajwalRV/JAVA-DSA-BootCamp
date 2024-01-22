import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int product = 1, sum = 0;
        while (N != 0) {
            int LastDigit = N % 10;
            product *= LastDigit;
            sum += LastDigit;
            N /= 10;
        } 
        int Difference = product - sum;
        System.out.println(Difference);
    }
}
