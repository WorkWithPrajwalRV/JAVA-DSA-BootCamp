import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Q : Subtract the Product and Sum of Digits of an Integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to Subtract the Product and Sum of Digits of an Integer : ");
        int n = input.nextInt();

        // Product Operation
        int temp = n;
        int product = 1;
        while (temp != 0) {
            int lastDigit = temp % 10; 
            product *= lastDigit;
            temp /= 10;
        }
        
        // Sum Operation 
        temp = n;
        int sum = 0;
        while (temp != 0) {
            int lastDigit = temp % 10;
            sum += lastDigit;
            temp /= 10;
        }

        // Substract product and sun
        int substract = product - sum;
        System.out.println(substract);
    }
}
