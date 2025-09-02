import java.util.Scanner; 
public class Oppgave_O1_2 {
    
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
         // andre løsning
         
           Scanner sc = new Scanner(System.in);
        System.out.println("Skriv inn bruttoinntekt: ");
        double inntekt = sc.nextDouble();
        double trinnskatt = 0;
        // Negativ sjekk
        if (inntekt < 0) {
            System.out.println("Inntekt kan ikke være negativ.");
            
            // Hvis inntekt under grensa
        } else if (inntekt >= 0 && inntekt <= 217400) {
            System.out.println("Du betaler ingen trinnskatt.");
        } else {
            // Trinn 1: 217 401 – 306 050 (1,7 %)
            if (inntekt > 217400) {
                double belop = Math.min(inntekt, 306050) - 217400;
                trinnskatt += belop * 0.017;
            }

            // Trinn 2: 306 051 – 697 150 (4,0 %)
            if (inntekt > 306050) {
                double belop = Math.min(inntekt, 697150) - 306050;
                trinnskatt += belop * 0.04;
            }

            // Trinn 3: 697 151 – 942 400 (13,7 %)
            if (inntekt > 697150) {
                double belop = Math.min(inntekt, 942400) - 697150;
                trinnskatt += belop * 0.137;
            }

            // Trinn 4: 942 401 – 1 410 750 (16,7 %)
            if (inntekt > 942400) {
                double belop = Math.min(inntekt, 1410750) - 942400;
                trinnskatt += belop * 0.167;
            }

            // Trinn 5: fra og med 1 410 751 (17,7 %)
            if (inntekt > 1410750) {
                double belop = inntekt - 1410750;
                trinnskatt += belop * 0.177;
            }

            System.out.println("Trinnskatten din blir: " + trinnskatt + " kr");
            
        }
    }
}

        