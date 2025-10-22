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
        Scanner inn = new Scanner(System.in);

        // Les inn persondata
        System.out.print("Fornavn: ");
        String firstName = inn.nextLine();
        System.out.print("Etternavn: ");
        String lastName = inn.nextLine();
        System.out.print("Fødselsår: ");
        int birthYear = inn.nextInt();

        Person person = new Person(firstName, lastName, birthYear);

        // Les inn arbeidsdata
        System.out.print("Arbeidstakernr: ");
        int arbtakernr = inn.nextInt();
        System.out.print("Ansettelsesår: ");
        int yearHired = inn.nextInt();
        System.out.print("Månedslønn: ");
        double monthlySalary = inn.nextDouble();
        System.out.print("Skatteprosent: ");
        double taxPercentage = inn.nextDouble();

        ArbTaker arb = new ArbTaker(person, arbtakernr, yearHired, monthlySalary, taxPercentage);

        // Vis informasjon
        System.out.println("\n" + arb.toString());
        System.out.println("\nSkattetrekk per måned: " + arb.getSkattetrekkPerMaaned() + " kr");
        System.out.println("Bruttolønn per år: " + arb.getBruttolonnPerAar() + " kr");
        System.out.println("Skattetrekk per år: " + arb.getSkattetrekkPerAar() + " kr");

        inn.close();
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
