package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Opdracht 2.1
        System.out.println("Opdracht 2.1\n");
        System.out.println("Typ het aantal mijlen: ");
        double mijlen = scanner.nextDouble();
        double kilometers = mijlen * 1.6;
        int tussenstap = (int) (kilometers * 10);
        kilometers = tussenstap / 10.0;
        System.out.println(mijlen + " mijlen is " + kilometers + " kilometer");

        //Opdracht 2.2
        System.out.println("Opdracht 2.2\n");
        System.out.println("Hoeveel jaar oud ben je? ");
        int leeftijdInJaren = scanner.nextInt();
        System.out.println("Hoeveel maanden komen daar nog bij? ");
        int leeftijdInMaanden = scanner.nextInt();
        int leeftijdInMinuten = leeftijdInJaren * 365 * 24 * 60 + leeftijdInMaanden * 30 * 24 * 60;
        System.out.println("Dan ben je nu ongeveer " + leeftijdInMinuten + " minuten oud ");

        //Opdracht 2.3
        System.out.println("Opdracht 2.3\n");
        System.out.println("Typ het startbedrag: ");
        double startbedrag = scanner.nextDouble();
        System.out.println("Typ het rentepercentage: ");
        double rentepercentage = scanner.nextDouble();
        double rentebedrag = rentepercentage / 100 * startbedrag;
        double totaalbedrag = startbedrag + rentebedrag;
        System.out.println("De rente is " + rentebedrag + " en het totaalbedrag is " + totaalbedrag + "\n\n");

        //Opdracht 2.4
        System.out.println("Opdracht 2.4\n");
        System.out.print("Typ een getal tussen 10 en 100: ");
        int userInput = scanner.nextInt();
        int buurman1 = userInput - 2;
        int buurman2 = userInput - 1;
        int buurman3 = userInput + 1;
        int buurman4 = userInput + 2;
        System.out.println("De vijf getallen zijn " + buurman1 + " - " + buurman2 + " - " + userInput + " - " + buurman3 + " - " + buurman4 + "\n\n");

        //Opdracht 2.5
        System.out.println("Opdracht 2.5\n");
        System.out.print("Typ een getal tussen 0 en 1000: ");
        userInput = scanner.nextInt();

        if (userInput >= 100 && userInput < 1000) {
            int lastDigit = userInput % 10;
            userInput = userInput / 10;

            int middleDigit = userInput % 10;
            userInput = userInput / 10;

            int firstDigit = userInput;

            int product = firstDigit * middleDigit * lastDigit;
            System.out.println("De vermenigvuldiging van de cijfers luidt: " + firstDigit + " x " + middleDigit + " x " + lastDigit + " = " + product + "\n\n");
        } else if (userInput >= 10 && userInput < 100) {
            int lastDigit = userInput % 10;
            userInput = userInput / 10;

            int firstDigit = userInput;

            int product = firstDigit * lastDigit;

            System.out.println("De vermenigvuldiging van de cijfers luidt: " + firstDigit + " x " + lastDigit + " = " + product + "\n\n");
        } else if (userInput >= 0 && userInput < 10) {
            System.out.println("De vermenigvuldiging van de cijfers luidt: " + userInput + " = " + userInput + "\n\n");
        } else {
            System.out.println("Sorry, het getal moet tussen de 0 en 1000 liggen.");
        }

    }
}
