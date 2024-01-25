import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruits = input.next();

        switch(fruits) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Keeps doctor away");
                break;
            case "Orange":
                System.out.println("Citrus fruit");
                break;
            case "Grapes":
                System.out.println("A grren fruit");
            break; 
            default:
                System.out.println("Enter Valid Fruit Input");       
        }
    }
}
