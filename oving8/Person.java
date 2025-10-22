
package oving8;

import org.w3c.dom.Text;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
        int aar = kalender.get(java.util.Calendar.YEAR);
        return aar - birthYear;
    }

    public String getNavn() {
        return lastName + ", " + firstName;
    }

    public String toString() {
        return getNavn() + ", født " + birthYear + " (" + getAge() + " år)";
    }
}
