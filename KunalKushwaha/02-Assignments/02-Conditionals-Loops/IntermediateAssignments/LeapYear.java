package IntermediateAssignments;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year to check it is leap year or not? ");
        System.out.print("Year : ");
        int year = input.nextInt();

        if (year % 100 == 0) {
            System.out.println(year + " is not a leap year");
        } else if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        }
    }
}
