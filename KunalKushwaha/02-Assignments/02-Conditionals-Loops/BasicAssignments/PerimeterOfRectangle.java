import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Length and Breadth of the Paralellogram : ");
        System.out.print("Length = ");
        double Length = input.nextInt();
        System.out.print("Side = ");
        double Breadth = input.nextInt();

        double Perimeter = 2 * (Length + Breadth);
        System.out.println("Perimeter of a given Rectangle is = " + Perimeter + " Meter Square");
    } 
}
