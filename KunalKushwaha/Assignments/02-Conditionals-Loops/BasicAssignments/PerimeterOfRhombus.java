import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Side of the Rhombus : ");
        System.out.print("Side = ");
        double Side = input.nextInt();
        

        double Perimeter = 4 * (Side);
        System.out.println("Perimeter of a given Rhombus is = " + Perimeter + " Meter Square");
    }
}
