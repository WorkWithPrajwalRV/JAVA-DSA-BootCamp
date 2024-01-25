import java.util.Scanner;

public class SwapFunction {
    public static int swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return temp;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("NUM1 = "); 
        int a  = input.nextInt();
        System.out.print("NUM2 = "); 
        int b  = input.nextInt();
        System.out.println(swap(a,b));
        System.out.print("a" + " = " + a + " b " + " = " + b);
    }
}
