import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radius and Height of the Prism : ");
        System.out.print("Radius = ");
        double Radius = input.nextInt();
        System.out.print("Height = ");
        double Height = input.nextInt();
        
        double Volume = (Math.PI * (Radius * Radius)) * Height;
        System.out.println("Volume of a given cylinder is = " + Volume + " Meter Square");
    }
}
