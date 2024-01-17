import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Side of the Square : ");
        System.out.print("Side = ");
        double Side = input.nextInt();
        

        double Perimeter = 4 * (Side);
        System.out.println("Perimeter of a given Square is = " + Perimeter + " Meter Square");
    }
}
