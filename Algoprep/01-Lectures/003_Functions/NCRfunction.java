import java.util.Scanner;

public class NCRfunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();

        int nFactorial = ncr(n);
        int rFactorial = ncr(r);
        int nMinuSrFactorial = ncr(n - r);

        int ncr = nFactorial/ (rFactorial * nMinuSrFactorial);
        System.out.println(ncr);

    }
     public static int ncr(int a) {
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
