import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // Area Of Isosceles Triangle Java Program
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Length and base height of the rectangle : ");
        System.out.print("Length = ");
        int length = input.nextInt();
        System.out.print("Base height = ");
        int breadth = input.nextInt();

        int area = (length * breadth) / (2);
        System.out.println("Area of a given isosceles triangle is = " + area + " Meter Square");
    }
}
