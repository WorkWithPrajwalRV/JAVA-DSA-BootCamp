import java.util.Scanner;

public class ReturnString {
    public static String greeting(String str) {
        str = "How are you";
        return str;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(str + " " + greeting(str));
    }
}
