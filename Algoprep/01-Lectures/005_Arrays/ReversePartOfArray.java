import java.util.Arrays;
import java.util.Scanner;

public class ReversePartOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        
        int[] revPartarr = new int[size];
        for (int i = 0; i < revPartarr.length; i++) {
            revPartarr[i] = input.nextInt();
        }
        System.out.print("Original array : ");
        System.out.println(Arrays.toString(revPartarr));

        int StartingPointOfArray = input.nextInt();
        int EndPointOfArray = input.nextInt();
        ReverseArr(revPartarr, StartingPointOfArray, EndPointOfArray);
        System.out.print("Reversed Array : ");
        System.out.print(Arrays.toString(revPartarr));
    }
    public static int[] ReverseArr(int[] revPartarr, int StartingPointOfArray, int EndPointOfArray) {
        while (StartingPointOfArray < EndPointOfArray) {
            int temp = revPartarr[StartingPointOfArray];
            revPartarr[StartingPointOfArray] = revPartarr[EndPointOfArray];
            revPartarr[EndPointOfArray] = temp;

            StartingPointOfArray++;
            EndPointOfArray--;
        }
        return revPartarr;
    }
}
