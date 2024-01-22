import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        // Sum of First N natural numbers
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int sum = (N*(N+1)) / 2;
        System.out.println(sum);
    }
}
