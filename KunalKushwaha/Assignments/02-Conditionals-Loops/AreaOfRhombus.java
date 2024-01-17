import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Diagonals length rhombus : ");
        System.out.print("Length = ");
        int length = input.nextInt();
        System.out.print("Base height = ");
        int breadth = input.nextInt();

        int area = (length * breadth) / (2);
        System.out.println("Area of a given isosceles triangle is = " + area + " Meter Square");
    }
}
