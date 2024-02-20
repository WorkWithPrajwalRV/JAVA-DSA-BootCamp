import java.util.Scanner;
import java.util.HashMap;

public class FrequencyQuery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int[] arr = new int[n];
        int[] querries = new int[m];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < querries.length; i++) {
            querries[i] = input.nextInt();
        }

        // HashMap syntax :

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i]) == false) {
                hm.put(arr[i], 1);
            }
            else {
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp+1);
            }
        }
        // Solving querries frequency :
        
        for (int i = 0; i < querries.length; i++) {
            if (hm.containsKey(querries[i]) == false) {
                System.out.println("0");
            }
            else {
                System.out.println(hm.get(querries[i]));
            }
        }
    }
}
