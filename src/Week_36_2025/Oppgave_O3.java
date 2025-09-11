import java.math.BigInteger;
import java.util.Scanner;

public class Oppgave_O3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        
        while (true) {
            System.out.print("Skriv inn et heltall n (>0): ");
            n = scan.nextInt();
            if (n > 0) break;
            System.out.println("Ugyldig n! n må være > 0. Prøv igjen.");
        }

        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println(n + "! = " + fact);
        scan.close();
    }
}
