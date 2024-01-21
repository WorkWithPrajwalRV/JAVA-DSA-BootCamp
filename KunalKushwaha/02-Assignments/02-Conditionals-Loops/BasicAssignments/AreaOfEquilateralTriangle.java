import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        // Area Of Equilateral Triangle
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of Equilateral Triangle : ");
        System.out.print("Side = ");
        double Side = input.nextDouble();

        double area = (Math.sqrt(3) / 4) * ( Side * Side);
        System.out.println("Area of a given Equilateral triangle is = " + area + " Meter Square");
    }
}
