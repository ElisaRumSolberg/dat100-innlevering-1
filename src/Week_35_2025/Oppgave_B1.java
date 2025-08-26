package Week_35_2025;

import java.util.Scanner;

public class Oppgave_B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dag: ");
        int dag = sc.nextInt();
        System.out.print("Måned: ");
        int mnd = sc.nextInt();
        System.out.print("År: ");
        int år = sc.nextInt();

        System.out.println("Dato: " + dag + "." + mnd + "." + år);

    }
}
