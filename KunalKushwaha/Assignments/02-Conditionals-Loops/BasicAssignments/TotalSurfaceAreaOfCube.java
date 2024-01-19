import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        // TotalSurfaceAreaOfCube
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Side of the Sphere : ");
        System.out.print("Side = ");
        long Side = input.nextInt();
        
        double TotalSurfaceAreaOfCube = 6 * (Side * Side);
        System.out.println("Total Surface Area of a given Cube is = " + TotalSurfaceAreaOfCube + " Meter Square");
    }
}
