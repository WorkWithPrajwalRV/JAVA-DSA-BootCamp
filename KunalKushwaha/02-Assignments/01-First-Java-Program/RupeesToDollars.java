import java.util.Scanner;

public class RupeesToDollars {
    public static void main(String[] args) {
        // 6. Input currency in rupees and output in USD.
        Scanner in = new Scanner(System.in);
        System.out.println("Deposit your INR to get the dollars worth of it : ");
        double inr = in.nextInt();

        double usd = inr / 85;

        System.out.println("$ "+ usd);
    
    }
}
 