package IntermediateAssignments;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Kunal is allowed to go out with his friends only on the even days of a given month. 
        // Write a program to count the number of days he can go out in the month of August.
        Scanner input = new Scanner(System.in);
        System.out.print("Which calender month holidays for kunal you want to check : ");
        String month = input.next();
        int DaysInMonth  = 0;
        if (month.equals("January")) {
            DaysInMonth = 31;
        } else if (month.equals("February")) {
            DaysInMonth = 29;
        } else if (month.equals("March")) {
            DaysInMonth = 31;
        } else if (month.equals("April")) {
            DaysInMonth = 30;
        } else if (month.equals("May")) {
            DaysInMonth = 31;
        } else if (month.equals("June")) {
            DaysInMonth = 30;
        } else if (month.equals("July")) {
            DaysInMonth = 31;
        } else if (month.equals("August")) {
            DaysInMonth = 31;
        } else if (month.equals("September")) {
            DaysInMonth = 30;
        } else if (month.equals("October")) {
            DaysInMonth = 31;
        } else if (month.equals("November")) {
            DaysInMonth = 30;
        } else if (month.equals("December")) {
            DaysInMonth = 31;
        }

        int count = 0;
        for (int i = 1; i <= DaysInMonth; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Number of days Kunal can go out in the month of " + month + " is = "+ count);
    }
}
