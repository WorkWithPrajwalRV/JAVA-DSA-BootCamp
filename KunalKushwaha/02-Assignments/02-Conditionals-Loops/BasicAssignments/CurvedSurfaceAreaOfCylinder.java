import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radius and Height of the Cylinder : ");
        System.out.print("Radius = ");
        double Radius = input.nextInt();
        System.out.print("Height = ");
        double Height = input.nextInt();
        
        double CurvedSurfaceArea = 2 * Math.PI * Radius * Height;
        System.out.println("Curved Surface area of a given Cylinder is = " + CurvedSurfaceArea + " Meter Square");
    }
}
