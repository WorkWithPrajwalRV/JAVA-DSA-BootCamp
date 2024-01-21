import java.util.Scanner;

public class PalindromeOfString {
    // 8. To find out whether the given String is Palindrome or not.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string check is it a palindrome : ");
        String str = in.next();
        str = str.toLowerCase();

        String rev = "";
        
        for (int i=str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    } 
}
