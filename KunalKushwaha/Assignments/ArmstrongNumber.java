import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // 9. To find Armstrong Number between two given number. 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to check is it Armstrong Number or not : ");
        int number = in.nextInt();

        int power = String.valueOf(number).length(); // to count number of digits in a number
        int sum = 0;
        int temp = number;
        System.out.println(power);
        for (int i=0;i<power;i++) {
            int lastDigit = temp % 10; // to extract last digit => 3, 5
            sum += lastDigit * power; // 3 * 3 * 3 = 27, 5 * 5 * 5 = 125 => 27 + 125 = 152,
            temp = temp/10;
        }
        System.out.println(sum);
        if (sum == number) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not a armstrong number");
        }
    }
}
