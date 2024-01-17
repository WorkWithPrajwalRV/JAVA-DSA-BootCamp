import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Side of the Equilateral Triangle : ");
        System.out.print("Side = ");
        double Side = input.nextInt();

        double Perimeter = 3 * Side;
        System.out.println("Perimeter of a given Equilateral Triangle is = " + Perimeter + " Meter Square");
    }
}
