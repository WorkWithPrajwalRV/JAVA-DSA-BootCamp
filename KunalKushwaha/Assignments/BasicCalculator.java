import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Now give two numbers a and b : ");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("Please enter a operator between (+, -, *, /) to perform operation on given numbers : ");
        char op = in.next().charAt(0);

        int sum = 0;

        if (op == '+') {
            sum = a + b;
        } 
        if (op == '-') {
            sum = a - b;
        } 
        if (op == '*') {
            sum = a * b;
        } 
        if (op == '/') {
            if (b!=0) {
                sum = a / b;
            }
        } 
        System.out.println(a + " " + op + " " + b + " = " + sum);
    }
}
