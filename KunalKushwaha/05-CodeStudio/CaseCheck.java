import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // To take char input
        char c = input.next().trim().charAt(0);
        int result = 0;
        if(c >= 'A' && c <= 'Z') {
            result = 1;
        } else if (c >= 'a' && c <= 'z' ) {
            result = 0;
        } else {
            result = -1;
        }
        System.out.println(result);
    }  
}
