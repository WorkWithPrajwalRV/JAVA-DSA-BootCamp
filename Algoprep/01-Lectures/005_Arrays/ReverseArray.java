import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        
        int[] revarr = new int[size];
        for (int i = 0; i < revarr.length; i++) {
            revarr[i] = input.nextInt();
        }
        System.out.print("Original array : ");
        System.out.println(Arrays.toString(revarr));

        ReverseArr(revarr);
        System.out.print("Reversed Array : ");
        System.out.print(Arrays.toString(revarr));
    }
    public static int[] ReverseArr(int[] revarr) {
        int StartingPointOfArray = 0;
        int EndPointOfArray = revarr.length - 1;

        while (StartingPointOfArray < EndPointOfArray) {
            int temp = revarr[StartingPointOfArray];
            revarr[StartingPointOfArray] = revarr[EndPointOfArray];
            revarr[EndPointOfArray] = temp;

            StartingPointOfArray++;
            EndPointOfArray--;
        }
        return revarr;
    }
}
