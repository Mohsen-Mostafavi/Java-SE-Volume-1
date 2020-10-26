package session01.exercise.rozhin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Info {

    public static void main(String[] args) {
        Personality personality = new Personality();
        Scanner scaner = new Scanner(System.in);

        System.out.print("Wann bist du geboren? z.B: yyyy");
        personality.geburtsdatum = scaner.nextInt();

        System.out.print("Was ist dein Vorname?");
        personality.vorname = scaner.next();

        System.out.print("Was ist dein Nachname?");
        personality.nachname = scaner.next();

        System.out.print("Was ist deine Ausweissnummer?");
        personality.ausweisNummer = scaner.next();

        LocalDate localDate = LocalDate.now();
        int alter = localDate.getYear() - personality.geburtsdatum;

        System.out.println();
        System.out.println("Du bist " + personality.vorname + " " + personality.nachname + " mit der Ausweisnummer " + personality.ausweisNummer);
        System.out.print("Wenn du im Jahr " + personality.geburtsdatum + " geboren bist, ");
        System.out.println("bist du jetzt " + alter + " jahre alt.");

    }


}
