import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radius of the Sphere : ");
        System.out.print("Radius = ");
        long Radius = input.nextInt();
        
        double Volume = (1.333333) * (Math.PI) * (Radius * Radius * Radius);
        System.out.println("Volume of a given Sphere is = " + Volume + " Meter Square");
    }
}
