import java.util.Arrays;
import java.util.Scanner;

public class SwapArrayElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        
        int[] SwapArr = new int[size];
        for (int i = 0; i < SwapArr.length; i++) {
            SwapArr[i] = input.nextInt();
        }
        System.out.print("Original array : ");
        System.out.println(Arrays.toString(SwapArr));

        System.out.println("given postions of elemets you want to swap : ");
        int index1 = input.nextInt();
        int index2 = input.nextInt();
        SwapArrayElements(SwapArr, index1, index2);

        System.out.print("Swapped array : ");
        System.out.print(Arrays.toString(SwapArr));
    }
    
    public static void SwapArrayElements(int[] SwapArr, int index1, int index2) {
        int temp = SwapArr[index1];
        SwapArr[index1] = SwapArr[index2];
        SwapArr[index2] = temp;
    }
}
