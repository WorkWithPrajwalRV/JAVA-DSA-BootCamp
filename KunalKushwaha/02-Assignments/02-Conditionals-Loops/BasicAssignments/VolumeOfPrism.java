import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Base and Height of the cone : ");
        System.out.print("Base = ");
        double Base = input.nextInt();
        System.out.print("Height = ");
        double Height = input.nextInt();
        
        double Volume = Base * Height;
        System.out.println("Volume of a given prism is = " + Volume + " Meter Square");
    }
}
