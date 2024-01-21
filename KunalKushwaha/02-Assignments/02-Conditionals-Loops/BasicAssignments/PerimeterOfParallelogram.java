import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Base and Side of the Paralellogram : ");
        System.out.print("Base = ");
        double Base = input.nextInt();
        System.out.print("Side = ");
        double Side = input.nextInt();

        double Perimeter = 2 * (Base + Side);
        System.out.println("Perimeter of a given Paralellogram is = " + Perimeter + " Meter Square");
    }
}
