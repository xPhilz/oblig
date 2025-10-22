/*
Øving 8
Oppgave 1
*/

package oving8;

import org.w3c.dom.Text;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Client
public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Les inn persondata
        System.out.print("Fornavn: ");
        String firstName = scanner.nextLine();
        System.out.print("Etternavn: ");
        String lastName = scanner.nextLine();
        System.out.print("Fødselsår: ");
        int birthYear = scanner.nextInt();

        Person person = new Person(firstName, lastName, birthYear);

        // Les inn arbeidsdata
        System.out.print("Arbeidstakernr: ");
        int arbtakernr = scanner.nextInt();
        System.out.print("Ansettelsesår: ");
        int yearHired = scanner.nextInt();
        System.out.print("Månedslønn: ");
        double monthlySalary = scanner.nextDouble();
        System.out.print("Skatteprosent: ");
        double taxPercentage = scanner.nextDouble();

        ArbTaker arb = new ArbTaker(person, arbtakernr, yearHired, monthlySalary, taxPercentage);

        boolean fortsett = true;

        while (fortsett) {
            // Meny
            System.out.println(
                    "\nHva vil du gjøre?:\n" +
                            "1: Hvor mange kroner arbeidstakeren trekkes i skatt per måned\n" +
                            "2: Bruttolønn per år\n" +
                            "3: Skattetrekk per år\n" +
                            "4: Navn\n" +
                            "5: Alder\n" +
                            "6: Antall år ansatt i bedriften\n" +
                            "7: Om personen har vært ansatt mer enn et gitt antall år\n" +
                            "8: Avslutt program"
            );

            int valg = scanner.nextInt();

            switch (valg) {
                case 1:
                    System.out.println("\nx:\n");
                    break;
                case 2:
                    System.out.println("\nx:\n");
                    break;
                case 3:
                    System.out.println("\nx");
                    break;
                case 4:
                    System.out.print("x:");
                    break;
                case 5:
                    System.out.println("\nx:\n");
                    break;
                case 6:
                    System.out.println("\nx:\n");
                    break;
                case 7:
                    System.out.println("\nSkriv inn antall år for å sjekke om person har vært ansatt lengre enn dette:\n");
                    int antallAar = scanner.nextInt();
                    if (arb.hiredMoreThan(antallAar)) {
                    System.out.println("Ja");
                    }
                    else {
                        System.out.println("Nei");
                    }
                    break;
                case 8:
                    fortsett = false;
                    System.out.println("Avslutter...");
                    continue;
                default:
                    System.out.println("Ugyldig valg, prøv igjen.");
                    continue;
            }
        }
        scanner.close();
    }
}

/*
Lag en klasse Person med attributter fornavn, etternavn og fødselsår. Klassen skal ha en getmetode for hvert attributt og være immutabel.
Lag en klasse ArbTaker med attributter personalia (datatype Person), arbtakernr, ansettelsesår,
månedslønn og skatteprosent. I tillegg til get-metoder for alle attributtene og set-metoder for å
endre attributter som det er naturlig at bør kunne forandres, skal klassen tilby operasjoner som
finner ut
• Hvor mange kroner arbeidstakeren trekkes i skatt per måned;
• Bruttolønn per år;
• Skattetrekk per år. Husk at juni er skattefri og i desember betales halv skatt;
• Navn på formen: etternavn, fornavn, eksempel: Johnsen, Berit;
• Alder;
• Antall år ansatt i bedriften;
• Om personen har vært ansatt mer enn et gitt antall år (parameter);
Finn ut i hvilke av disse tilfellene at ArbTaker-objektet må samarbeide med personaliaobjektet for å løse oppgaven. Tegn sekvensdiagram for disse operasjonene.
Inneværende år får du ut med følgende kodelinjer:
Java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
Int år = kalender.get(java.util.Calendar.YEAR);
Lag et enkelt klientprogram som legger inn data i et objekt av klassen ArbTaker og kaller alle
objektmetodene du har laget. Kontroller at resultatene blir riktige.
Lag et menystyrt program som gir brukeren muligheten til å forandre på datainnholdet i
objektet. La programmet gå i løkke slik at flere forandringer kan gjøres. For hvert
løkkegjennomløp skal programmet sende passende get-meldinger til objektet og skrive ut
resultatet av disse, slik at det er mulig å kontrollere at endringen er blitt utført. Lag eventuelt
toStrin()-metoder og bruk disse.
*/
