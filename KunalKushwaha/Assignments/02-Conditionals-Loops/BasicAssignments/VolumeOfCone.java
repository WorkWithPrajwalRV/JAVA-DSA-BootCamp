import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        // Volume Of Cone Java Program
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radius and Height of the cone : ");
        System.out.print("Radius = ");
        double Radius = input.nextInt();
        System.out.print("Height = ");
        double Height = input.nextInt();
        
        double Volume = (Math.PI * (Radius * Radius)) * (Height / 3);
        System.out.println("Volume of a given Cone is = " + Volume + " Meter Square");
    }
}
