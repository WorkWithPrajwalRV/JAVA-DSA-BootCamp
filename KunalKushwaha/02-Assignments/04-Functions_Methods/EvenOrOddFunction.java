import java.util.Scanner;

public class EvenOrOddFunction {
    // Define a program to find out whether a given number is even or odd.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        String result = evenodd(n);
        System.out.println(result);
    }
    public static String evenodd(int n) {
        String result;
        if(n % 2 == 0) {
            result = "even";
        } else {
           result = "odd";
        }
        return result;
    }
}
