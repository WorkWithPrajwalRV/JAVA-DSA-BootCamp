import java.util.Scanner;

public class CountingOccurances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = in.nextInt();
        System.out.println("Enter a digit which u want to see it is occured : ");
        int sn = in.nextInt();
        int count = 0;

        while (n > 0) {
            int remainder = n % 10; // extracting last digit
            if (remainder == 3) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
