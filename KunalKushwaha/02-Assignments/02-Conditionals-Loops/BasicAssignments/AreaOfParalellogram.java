import java.util.Scanner;

public class AreaOfParalellogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base and height of the Paralellogram : ");
        System.out.print("Base = ");
        int base = input.nextInt();
        System.out.print("Height = ");
        int height = input.nextInt();

        int area = (base * height);
        System.out.println("Area of a given Paralellogram is = " + area + " METER SQUARE");
    }
}
