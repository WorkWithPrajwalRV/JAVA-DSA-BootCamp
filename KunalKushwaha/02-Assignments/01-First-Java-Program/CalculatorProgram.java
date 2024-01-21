import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        // Take the input until user enter x
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            // take oprator as input 
            System.out.print("Enter a operator : ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // take number as input
                System.out.print("Enter num1 : ");
                int num1 = in.nextInt();
                System.out.print("Enter num2 : ");
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);  
        }
    }
}
