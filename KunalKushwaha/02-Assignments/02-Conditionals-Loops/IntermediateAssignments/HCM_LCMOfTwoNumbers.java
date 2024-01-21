package IntermediateAssignments;

import java.util.Scanner;

public class HCM_LCMOfTwoNumbers {
    public static void main(String[] args) {
        // HCF -> 18 = 1, 2, 3, 6, 9, 18
        //        12 = 1, 2, 3, 4, 6, 12
        // HCF(18, 12) = 6

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers to find their HCF anf LCM : ");
        System.out.print("Num1 = ");
        int a = input.nextInt();
        System.out.print("Num2 = ");
        int b = input.nextInt();

        int lcma = a;
        int lcmb = b;

        // HCF
        int temp = 0;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        int HCF = a;
        System.out.println(HCF);

        // LCM
        int LCM = (lcma * lcmb) / HCF;
        System.out.println(LCM);
    }
}
