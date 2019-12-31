package kosci;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Random a = new Random();
        Random b = new Random();
        Random c = new Random();
        Random d = new Random();
        Random e = new Random();

        int kostka1 = a.nextInt(5) + 1;
        int kostka2 = b.nextInt(5) + 1;
        int kostka3 = c.nextInt(5) + 1;
        int kostka4 = d.nextInt(5) + 1;
        int kostka5 = e.nextInt(5) + 1;

        System.out.println("Kostka 1: " + kostka1);
        System.out.println("Kostka 2: " + kostka2);
        System.out.println("Kostka 3: " + kostka3);
        System.out.println("Kostka 4: " + kostka4);
        System.out.println("Kostka 5: " + kostka5);

        for (int j = 0; j < 2; j++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Czy chcesz rzucić ponowanie kośćmi? Tak wpisz 1, nie wpisz 2");
            int odpowiedz = scanner.nextInt();
            int iloscTur = 1;
            if (odpowiedz == 1) {
                System.out.println("Iloma kośćmi chcesz rzucić?");
                Scanner scanner1 = new Scanner(System.in);
                int iloscKosci = scanner1.nextInt();
                System.out.println("Wpisz nr kosci i wcisnij enter");
                for (int i = 0; i < iloscKosci; i++) {
                    Scanner scanner2 = new Scanner(System.in);
                    int nrKosci = scanner2.nextInt();
                    switch (nrKosci) {
                        case 1:
                            int kostka11 = a.nextInt(5) + 1;
                            kostka1 = kostka11;
                            break;
                        case 2:
                            int kostka22 = b.nextInt(5) + 1;
                            kostka2 = kostka22;
                            break;
                        case 3:
                            int kostka33 = b.nextInt(5) + 1;
                            kostka3 = kostka33;
                            break;
                        case 4:
                            int kostka44 = b.nextInt(5) + 1;
                            kostka4 = kostka44;
                            break;
                        case 5:
                            int kostka55 = b.nextInt(5) + 1;
                            kostka5 = kostka55;
                            break;
                    }
                }
                System.out.println("Kostka 1: " + kostka1);
                System.out.println("Kostka 2: " + kostka2);
                System.out.println("Kostka 3: " + kostka3);
                System.out.println("Kostka 4: " + kostka4);
                System.out.println("Kostka 5: " + kostka5);

            }

        }

    }
}
