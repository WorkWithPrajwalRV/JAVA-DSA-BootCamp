import java.util.Scanner;
public class ReturnInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input num1 = ");
        int a = input.nextInt();
        System.out.print("input num2 = ");
        int b = input.nextInt();
        System.out.println(a + " + " + b + " = " + sum(a,b));
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
