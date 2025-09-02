import java.util.Scanner; 
public class Oppgave_O1_1 {
    
    public static void main(String args[]) {
/*
 Trinnskatten for personlige skattepliktige beregnes av personinntekten.
 Personinntekt er lønnsinntekt og øvrige inntekter som erstatter lønnsinntekt,
 f.eks. sykepenger, arbeidsavklaringspenger, uføretrygd og pensjon.
Trinnskatten består av fem trinn.
For de første 217 400 kronene av personinntekten din, skal du ikke betale trinnskatt.

 	Inntekten mellom 0 – 217 400 kroner	Ingen trinnskatt
Trinn 1	Inntekten mellom 217 401 – 306 050 kroner	1,7 % trinnskatt
Trinn 2	Inntekten mellom 306 051 – 697 150 kroner	4,0 %  trinnskatt
Trinn 3	Inntekten mellom 697 151 – 942 400 kroner	13,7 % trinnskatt
Trinn 4	Inntekten mellom 942 401 – 1 410 750 kroner 	16,7 % trinnskatt
Trinn 5	Inntekten fra og med 1 410 751 kroner	17,7 %  trinnskatt

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv inn bruttoinntekt: ");
        
        double inntekt = sc.nextDouble();

        double trinnskatt = 0;

        if(inntekt<0)
        {
          System.out.println("Inntekt kan ikke være negativ.");
          return;
              
        }else if (inntekt <= 217400) {
            trinnskatt = 0;
        } else if (inntekt <= 306050) {
            trinnskatt = (inntekt - 217400) * 0.017;
        } else if (inntekt <= 697150) {
            trinnskatt = (306050 - 217400) * 0.017
                    + (inntekt - 306050) * 0.04;
        } else if (inntekt <= 942400) {
            trinnskatt = (306050 - 217400) * 0.017
                    + (697150 - 306050) * 0.04
                    + (inntekt - 697150) * 0.137;
        } else if (inntekt <= 1410750) {
            trinnskatt = (306050 - 217400) * 0.017
                    + (697150 - 306050) * 0.04
                    + (942400 - 697150) * 0.137
                    + (inntekt - 942400) * 0.167;
        } else {
            trinnskatt = (306050 - 217400) * 0.017
                    + (697150 - 306050) * 0.04
                    + (942400 - 697150) * 0.137
                    + (1410750 - 942400) * 0.167
                    + (inntekt - 1410750) * 0.177;
        }

        System.out.println("Trinnskatten din blir: " + trinnskatt + " kr");
    }
}


        
        