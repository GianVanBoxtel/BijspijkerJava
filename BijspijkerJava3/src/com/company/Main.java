package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Opdracht 3.1
        System.out.println("Opdracht 3.1\n");
        int random1 = (int) (Math.random() * 10 + 1);
        int random2 = (int) (Math.random() * 10 + 1);
        System.out.println("Hoeveel is " + random1 + " + " + random2 + " ? ");
        int userInput = scanner.nextInt();
        int uitkomst = random1 + random2;
        if (userInput == uitkomst) {
            System.out.println("Klopt!\n\n");
        } else {
            System.out.println("Helaas, het juiste antwoord was " + uitkomst + ".\n\n");
        }

        //Opdracht 3.2
        System.out.println("Opdracht 3.2\n");
        random1 = (int) (Math.random() * 10 + 1);
        random2 = (int) (Math.random() * 10 + 1);
        int random3 = (int) (Math.random() * 10 + 1);
        System.out.print("Hoeveel is " + random1 + " x " + random2 + " x " + random3 + " ? ");
        userInput = scanner.nextInt();
        uitkomst = random1 * random2 * random3;
        if (userInput == uitkomst) {
            System.out.println("Helemaal goed!\n\n");
        } else {
            System.out.println("Helaas, het juiste antwoord was " + uitkomst + ".\n\n");
        }

        //Opdracht 3.3
        System.out.println("Opdracht 3.3\n");
        random1 = (int) (Math.random() * 12 + 1);
        String maand = "onbekend";
        switch (random1) {
            case 1: maand = "januari"; break;
            case 2: maand = "februari"; break;
            case 3: maand = "maart"; break;
            case 4: maand = "april"; break;
            case 5: maand = "mei"; break;
            case 6: maand = "juni"; break;
            case 7: maand = "juli"; break;
            case 8: maand = "augustus"; break;
            case 9: maand = "september"; break;
            case 10: maand = "oktober"; break;
            case 11: maand = "november"; break;
            case 12: maand = "december"; break;


        }
        System.out.println("Het random getal is " + random1 + " en dat is de maand " + maand + ".\n\n");

        //Opdracht 3.4
        System.out.println("Opdracht 3.4\n");
        System.out.println("Welke weekdag is het nu? ( 1 = ma / 2 = di / 3 = wo / 4 = do / 5 = vr / 6 = za / 7 = zo)\n");
        int weekdag = scanner.nextInt();
        System.out.println("En van hoeveel dagen in de toekomst wil je de weekdag berekenen?\n");
        int dagenVooruit = scanner.nextInt();
        int resultaat = weekdag + dagenVooruit;
        if (resultaat > 7) {
            resultaat = resultaat % 7;
        }
        String[] weekdagen = {"onbekend", "maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag", "zondag" };
        System.out.println("Vandaag is het " + weekdagen[weekdag] + " en over " + dagenVooruit + " dagen is het " + weekdagen[resultaat] + ".\n\n");

        //Opdracht 3.5
        System.out.println("Opdracht 3.5\n");
        System.out.print("Wat is uw gewicht (kg) ? ");
        double gewicht = scanner.nextDouble();
        System.out.print("Wat is uw lengte (m) ? ");
        double lengte = scanner.nextDouble();
        double teller = gewicht;
        double noemer = lengte * lengte;
        double bmi = teller / noemer;
        int tussenstap = (int) (bmi * 100);
        bmi = tussenstap / 100.0;
        System.out.println("Uw BMI is " + bmi + ".");
        String conclusie = "onbekend";
        if (bmi < 18.5) {
            conclusie = "ondergewicht heeft";
        } else if (bmi < 25) {
            conclusie = "een normaal gewicht heeft";
        } else if (bmi < 30)  {
            conclusie = "overgewicht heeft";
        } else {
            conclusie = "zwaar overgewicht heeft";
        }
        System.out.println("Als u minstens 20 jaar bent betekent dit dat u " + conclusie + ".\n\n");

        //Opdracht 3.6
        System.out.println("Opdracht 3.6\n");
        System.out.println("Getal 1: ");
        int getal1 = scanner.nextInt();
        System.out.println("Getal 2: ");
        int getal2 = scanner.nextInt();
        System.out.println("Getal 3: ");
        int getal3 = scanner.nextInt();
        int[] getallen = {getal1,getal2,getal3};
        Arrays.sort(getallen);
        System.out.println("Van klein naar groot: " + getallen[0] + " - " + getallen[1] + " - " + getallen[2]);
    }
}
