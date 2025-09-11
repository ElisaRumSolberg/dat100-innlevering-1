import java.util.Scanner;

public class Oppgave_O2_c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int score;

            while (true) {
                System.out.print("Student " + i + " - skriv inn poengsum (0-100): ");
                score = scan.nextInt();
                if (score >= 0 && score <= 100) break;
                System.out.println("Ugyldig poengsum! Prøv igjen.");
            }

            if (score >= 90) {
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
        }

        scan.close();
    }
}
