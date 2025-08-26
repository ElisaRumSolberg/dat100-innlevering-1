package Week_35_2025;

import java.util.Scanner;

public class Oppgave_G3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv inn tall 1:");
        int Tall1 = sc.nextInt();
        System.out.println("Skriv inn tall 2:");
        int Tall2 = sc.nextInt();
        System.out.println("Skriv inn tall 3:");
        int Tall3 = sc.nextInt();
        System.out.println("Skriv inn tall 4:");
        int Tall4 = sc.nextInt();


        int minst1 = Math.min(Tall1, Tall2);
        int minst2 = Math.min(Tall3, Tall4);
        int minst3 = Math.min(minst1, minst2);
         System.out.println("Det minste tallet er: " + minst3);

        int minst= Math.min(Math.min(Tall1,Tall2),Math.min(Tall3,Tall4));
        System.out.println("Det minste tallet er: " + minst);

        int a=5;
        int b=756;
        int c=345;
        int d=23;
        int maks = Math.max(Math.max(a,b),Math.max(c,d));
        System.out.println("Det største tallet er: " + maks);

    }
}
