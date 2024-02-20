import java.util.Scanner;
import java.util.HashSet;

public class DistinctElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(NumberOfDistictElements(arr));
    }
    public static int NumberOfDistictElements(int[] arr) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) { 
                hs.add(arr[i]);
        }
        return hs.size();
    }
}
