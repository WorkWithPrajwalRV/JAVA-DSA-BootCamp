import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Length and Breadth of the rectangle : ");
        System.out.print("Length = ");
        int length = input.nextInt();
        System.out.print("Breadth = ");
        int breadth = input.nextInt();

        int area = (length * breadth);
        System.out.println("Area of a given rectangle is = " + area + " Meter Square");
    }
}
