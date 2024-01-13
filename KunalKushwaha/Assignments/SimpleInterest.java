import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the below contraints to calculate Simple Interest of your loan : ");
        System.out.print("Enter the Principal Amount you like to take as loan : ");
        int p = in.nextInt();
        System.out.print("Enter the Time period in years u might take to repay the loan : ");
        int t = in.nextInt();
        System.out.print("Enter the Rate of interest you ioccured : ");
        float r = in.nextFloat();


        double SimpleInterest = (p * t * r) / 100;
        System.out.println("Your loan's Effective Simple Interest is  : " + SimpleInterest);

    }
    
}
