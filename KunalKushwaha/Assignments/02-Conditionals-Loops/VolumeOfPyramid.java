import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Base length, Base width and Pyramid Height of the Pyramid : ");
        System.out.print("Base Length = ");
        double BaseLength = input.nextInt();
        System.out.print("Base Width = ");
        double BaseWidth = input.nextInt();
        System.out.print("Pyramid Height = ");
        double PyramidHeight = input.nextInt();
        
        double Volume = (BaseLength * BaseWidth * PyramidHeight) / (3);
        System.out.println("Volume of a given Pyramid is = " + Volume + " Meter Square");
    }
}
