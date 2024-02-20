import java.util.Scanner;
import java.util.HashMap;

public class FirstNonRepeatingElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(firstnonrepatingelement(arr));
    }
    public static int firstnonrepatingelement(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])== false) {
                hm.put(arr[i], 1);
            }
            else {
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp+1);
            }
        }
        // Code to get first non repeating elements :
        for (int i = 0; i < arr.length; i++) {
            if (hm.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return -1;
    }
}
