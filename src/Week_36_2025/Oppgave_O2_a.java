import java.util.Scanner;

public class Oppgave_O2_a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Skriv inn poengsum (0-100): ");
        int score = scan.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Ugyldig poengsum!");
        } else if (score >= 90) {
            System.out.println("Karakter: A");
        } else if (score >= 80) {
            System.out.println("Karakter: B");
        } else if (score >= 60) {
            System.out.println("Karakter: C");
        } else if (score >= 50) {
            System.out.println("Karakter: D");
        } else if (score >= 40) {
            System.out.println("Karakter: E");
        } else {
            System.out.println("Karakter: F");
        }

        scan.close();
    }
}
