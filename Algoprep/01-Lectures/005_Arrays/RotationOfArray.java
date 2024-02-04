import java.util.Arrays;
import java.util.Scanner;

public class RotationOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int ek = k % n;
        int[] rotateArr = new int[n];
        for (int i = 0; i < rotateArr.length; i++) {
            rotateArr[i] = input.nextInt();
        }
        
        int s = 0;
        int e = n-1;
        // Step 1 => Reverse whole array
        ReverseArr(rotateArr, s, e);

        // Step 1 => Reverse array from 0 to k-1
        ReverseArr(rotateArr, s, ek-1);

        // Step 1 => Reverse array from k to n-1
        ReverseArr(rotateArr, ek, n-1);

        System.out.println(Arrays.toString(rotateArr));
    }
    public static void ReverseArr(int[] rotateArr,int s,int e) {
        int n = rotateArr.length;
        while (s < e) {
            int temp = rotateArr[s];
            rotateArr[s] = rotateArr[e];
            rotateArr[e] = temp;

            s++;
            e--;
        }
    }
}
