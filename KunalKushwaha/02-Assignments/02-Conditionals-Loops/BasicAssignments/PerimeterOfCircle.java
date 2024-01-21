import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        System.out.print("Radius = ");
        double Radius = input.nextInt();

        double Perimeter = 2 * (Math.PI * Radius);
        System.out.println("Perimeter of a given circle is = " + Perimeter + " Meter Square");
    }
}
