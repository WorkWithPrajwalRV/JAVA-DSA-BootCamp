import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        double radius = input.nextInt();

        double area = Math.PI * radius * radius;
        System.out.println("Area of a given circle is = " + area + " Meter Square");
    }
}
