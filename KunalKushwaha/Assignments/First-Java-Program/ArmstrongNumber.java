import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // 9. To find Armstrong Number between two given number. 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range to get armstrong number between that range : ");   
        System.out.print("StartRange = ");
        int StartRange = in.nextInt();
        System.out.print("EndRange = ");
        int EndRange = in.nextInt();

        

        for (int number = StartRange; number <= EndRange; number++) {

            int digits = 0;
            int result = 0;
            int originalNummber = number; 
            
            // Conuting digits in a number
            while (originalNummber != 0) {
                originalNummber /= 10;
                ++digits;
            }

            originalNummber = number;

            // Performing Armstong operation on number 
            while (originalNummber != 0) {
                int remainder = originalNummber % 10;
                result += Math.pow(remainder, digits);
                originalNummber /= 10;
            }

            // Printing armstring number b/w the range
            if (result == number) {
                System.out.print(number + " ");
            }
        }
    }
}
