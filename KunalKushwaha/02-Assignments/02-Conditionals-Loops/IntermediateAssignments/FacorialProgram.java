package IntermediateAssignments;

import java.util.Scanner;

public class FacorialProgram {
    public static void main(String[] args) {
        // Factorial Program In Java : 
        // Ex :- Factorial of 5 => 5! = 5 * 4 * 3 * 2 * 1

        // decrementing from given input n
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }
        System.out.println(n+ "! = " + factorial);
    }
}
