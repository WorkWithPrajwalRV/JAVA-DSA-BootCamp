import java.util.Scanner;

public class CountElementsApartGreater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ArraySize = input.nextInt();
        int[] arr = new int[ArraySize];
        int max = arr[0], maxcount = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(max(arr, max, maxcount));
    }
    public static int max(int[] arr, int max, int maxcount) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                maxcount++;
            }
        }
        return n - maxcount;
    }
}
// TWOSUM =>
// public static void main(String[] args) {
//     /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     Scanner input = new Scanner(System.in);
//     int n = input.nextInt();
//     int[] arr = new int[n];
//     for (int i = 0;i < arr.length;i++) {
//     arr[i] = input.nextInt();
//     }
//     int k = input.nextInt();
//     int i = 0;
//     int j = 0;
//     System.out.println(twoSum(arr, k));
// }
// public static boolean twoSum(int[] arr,int k) {
//     for (int i = 0;i < arr.length;i++) {
//         for(int j = i + 1;j < arr.length;j++) {
//             if (arr[i]+arr[j] == k) {
//                 return true;
//             }
//         }
//     }
//     return false;
// }