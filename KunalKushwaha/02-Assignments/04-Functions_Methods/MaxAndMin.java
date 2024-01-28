import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        // Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();

        int max = max(a, b, c);
        int min = min(a, b, c);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    public static int max(int a, int b, int c) {
        int max = a;
        if(b > max){
            max = b;
        } else if (c > max) {
            max = c;
        }
        return max;
    }
    public static int min(int a, int b, int c) {
        int min = a;
        if(b < min){
            min = b;
        } else if (c < min) {
            min = c;
        }
        return min;
    }
}
