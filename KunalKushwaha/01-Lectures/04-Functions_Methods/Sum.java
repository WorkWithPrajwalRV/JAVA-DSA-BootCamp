import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input num1 = ");
        int a = input.nextInt();
        System.out.print("input num2 = ");
        int b = input.nextInt();
        sum(a,b);
    }

    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }
}
