package Week_35_2025;

import java.util.Scanner;

public class Oppgave_G2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // --- Part 1: Fixed value test ---

        int nd=30;

        switch (nd){
            case 1:System.out.println("Mandag");
                break;
            case 2 :  System.out.println("tirsdag");
                break;
            case 3 : System.out.println("Onsdag");
                break;
            case 4:   System.out.println("Torsdag");
                break;
            case 5:   System.out.println("Fredag");
                break;
            case 6:   System.out.println("Lørdag");
                break;
            case 7:    System.out.println("Søndag");
                break;
            default:
                System.out.println("Ulovlig nummer");
        }
        System.out.print("Enter a number (1-7): ");
        int userDn = scan.nextInt();
        switch (userDn){
            case 1:System.out.println("Mandag");
            break;
            case 2:System.out.println("tirsdag");
            break;
            case 3:System.out.println("Onsdag");
            break;
            case 4:System.out.println("Torsdag");
            break;
            case 5:System.out.println("Fredag");
            break;
            case 6:System.out.println("Lørdag");
            break;
            case 7:System.out.println("Søndag");
            break;
            default:System.out.println("Ulovlig nummer");
        }
    }
}
