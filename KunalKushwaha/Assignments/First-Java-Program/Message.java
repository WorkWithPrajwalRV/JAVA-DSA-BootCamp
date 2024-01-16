import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        // 2. Take name as input and print a greeting message for that particular name.
        Scanner in = new Scanner(System.in);
        System.out.print("Give input as name and get greeting message : ");
        String name = in.nextLine();

        System.out.println("Good Afternoon " + name);
    }
}
 