import java.util.Scanner;
import java.util.HashSet;

public class HashSetSyntax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(10);
        for (Integer v : hs) {
            System.out.println(v);
        }
    }
}
