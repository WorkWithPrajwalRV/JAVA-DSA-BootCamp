import java.util.HashMap;

public class HashMapItteration {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])== false) {
                hm.put(arr[i], 1);
            }
            else {
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp+1);
            }
        }
        for(int v: hm.keySet()) {
            System.out.println(v);
        }
    }
}
