import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        // 1. Write a program to print whether a number is even or odd, also take input from the user.
        Scanner in = new Scanner(System.in);
        System.out.println("Give nuber as input and cjeck weather it is even or odd : ");
        int n = in.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    
}
 