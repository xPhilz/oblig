
package oving8;

import org.w3c.dom.Text;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArbTaker {
    private Person personalia;
    private final int arbtakernr;
    private final int yearHired;
    private double monthlySalary;
    private double skatteprosent;

    public ArbTaker(Person personalia, int arbtakernr, int yearHired,
                    double monthlySalary, double skatteprosent) {
        this.personalia = personalia;
        this.arbtakernr = arbtakernr;
        this.yearHired = yearHired;
        this.monthlySalary = monthlySalary;
        this.skatteprosent = skatteprosent;
    }

    public Person getPersonalia() {
        return personalia;
    }

    public int getArbtakernr() {
        return arbtakernr;
    }

    public int getAnsettelsesaar() {
        return yearHired;
    }

    public double getMaanedslonn() {
        return monthlySalary;
    }

    public double getSkatteprosent() {
        return skatteprosent;
    }

    public void setMaanedslonn(double nyMaanedslonn) {
        this.monthlySalary = nyMaanedslonn;
    }

    public void setSkatteprosent(double nySkatteprosent) {
        this.skatteprosent = nySkatteprosent;
    }

    public double getSkattetrekkPerMaaned() {
        return monthlySalary * (skatteprosent / 100);
    }

    public double getBruttolonnPerAar() {
        return monthlySalary * 12;
    }

    public double getSkattetrekkPerAar() {
        // 10 måneder full skatt + desember halv skatt (juni skattefri)
        return getSkattetrekkPerMaaned() * 10.5;
    }

    public String getNavn() {
        return personalia.getNavn();
    }

    public int getAlder() {
        return personalia.getAge();
    }

    public int getYearAnsatt() {
        java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
        int aar = kalender.get(java.util.Calendar.YEAR);
        return aar - yearHired;
    }

    public boolean harVaertAnsattMerEnn(int antallAar) {
        return getYearAnsatt() > antallAar;
    }

    public String toString() {
        return "Arbeidstaker: " + getNavn() + "\n" +
                "Arbtakernr: " + arbtakernr + "\n" +
                "Ansatt: " + yearHired + " (" + getYearAnsatt() + " år)\n" +
                "Månedslønn: " + monthlySalary + " kr\n" +
                "Skatt: " + skatteprosent + "%";
    }
}
