package Week_35_2025;

import java.util.Scanner;

public class Oppgave_G1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=7;
        if(n %2==0){
            System.out.println("tallet n er et partall.");
        }else {
            System.out.println("tallet n er et oddetall.");
        }

        int n1=24;
        if(n1%2==0){
            System.out.println("tallet n1 er et partall.");
        }else {
            System.out.println("tallet n1 er et oddetall.");
        }
// bonus
            System.out.println("Please enter a number: ");

            int number = sc.nextInt();
            if(number %2==0) {
                System.out.println("The number is even");
            }else  {
                System.out.println("The number is odd");
            }
        }
    }

