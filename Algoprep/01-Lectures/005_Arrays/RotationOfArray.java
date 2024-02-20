import java.util.Arrays;
import java.util.Scanner;

public class RotationOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int[] rotateArr = new int[n];
        for (int i = 0; i < rotateArr.length; i++) {
            rotateArr[i] = input.nextInt();
        }
        int k = input.nextInt();
        int ek = k % n;

        // Step 1 : reverse whole array :
        ReverseArr(rotateArr, 0, n-1);
        // Step 2 : reverse array from 0 to ek-1:
        ReverseArr(rotateArr, 0, ek-1);
        // Step 3 : reverse array from ek to n-1 :
        ReverseArr(rotateArr, ek, n-1);
        for (int i = 0; i < rotateArr.length; i++) {
            System.out.print(rotateArr[i] + " ");
        }
        
    }
    public static void ReverseArr(int[] rotateArr,int s,int e) {
        int n = rotateArr.length;
        int sp = s;
        int ep = e;
        while (sp < ep) {
            int temp = rotateArr[sp];
            rotateArr[sp] = rotateArr[ep];
            rotateArr[ep] = temp;

            sp++;
            ep--;
        }
    }
}

