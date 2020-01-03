package gra;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj imię gracza nr 1");
        Scanner scanner4 = new Scanner(System.in);
        String gracz1 = scanner4.nextLine();
        System.out.println("Podaj imię gracza nr 2");
        Scanner scanner5 = new Scanner(System.in);
        String gracz2 = scanner5.nextLine();

        Random a = new Random();
        Random b = new Random();
        Random c = new Random();
        Random d = new Random();
        Random e = new Random();


        int[] wynikGracz1 = new int[17];
        int jedynkiGracz1 = wynikGracz1[0];
        int dwojkiGracz1 = wynikGracz1[1];
        int trojkiGracz1 = wynikGracz1[2];
        int czworkiGracz1 = wynikGracz1[3];
        int piatkiGracz1 = wynikGracz1[4];
        int szotkiGracz1 = wynikGracz1[5];
        int bonusGracz1 = wynikGracz1[6];
        int suma1Gracz1 = wynikGracz1[7] = wynikGracz1[0] + wynikGracz1[1] + wynikGracz1[2] + wynikGracz1[3] + wynikGracz1[4] + wynikGracz1[5] + wynikGracz1[6];
        int trzyJednakoweGracz1 = wynikGracz1[8];
        int cztwryJednakoweGracz1 = wynikGracz1[9];
        int fullGracz1 = wynikGracz1[10];
        int malyStritGracz1 = wynikGracz1[11];
        int duzyStritGracz1 = wynikGracz1[12];
        int generalGracz1 = wynikGracz1[13];
        int szansaGracz1 = wynikGracz1[14];
        int suma2Gracz1 = wynikGracz1[15] = wynikGracz1[8] + wynikGracz1[9] + wynikGracz1[10] + wynikGracz1[11] + wynikGracz1[12] + wynikGracz1[13] + wynikGracz1[14];
        int razemGracz1 = wynikGracz1[16] = wynikGracz1[7] + wynikGracz1[15];

        int[] wynikGracz2 = new int[17];
        int jedynkiGracz2 = wynikGracz2[0];
        int dwojkiGracz2 = wynikGracz2[1];
        int trojkiGracz2 = wynikGracz2[2];
        int czworkiGracz2 = wynikGracz2[3];
        int piatkiGracz2 = wynikGracz2[4];
        int szotkiGracz2 = wynikGracz2[5];
        int bonusGracz2 = wynikGracz2[6];
        int suma1Gracz2 = wynikGracz2[7] = wynikGracz2[0] + wynikGracz2[1] + wynikGracz2[2] + wynikGracz2[3] + wynikGracz2[4] + wynikGracz2[5] + wynikGracz2[6];
        int trzyJednakoweGracz2 = wynikGracz2[8];
        int cztwryJednakoweGracz2 = wynikGracz2[9];
        int fullGracz2 = wynikGracz2[10];
        int malyStritGracz2 = wynikGracz2[11];
        int duzyStritGracz2 = wynikGracz2[12];
        int generalGracz2 = wynikGracz2[13];
        int szansaGracz2 = wynikGracz2[14];
        int suma2Gracz2 = wynikGracz2[15] = wynikGracz2[8] + wynikGracz2[9] + wynikGracz2[10] + wynikGracz2[11] + wynikGracz2[12] + wynikGracz2[13] + wynikGracz2[14];
        int razemGracz2 = wynikGracz2[16];

        for (int z = 0; z < 13; z++) {

            for (int x = 0; x < 1; x++) {
                System.out.println("Rzuca gracz: " + gracz1);
                int k1 = a.nextInt(5) + 1;
                int k2 = b.nextInt(5) + 1;
                int k3 = c.nextInt(5) + 1;
                int k4 = d.nextInt(5) + 1;
                int k5 = e.nextInt(5) + 1;
                int wybranieFigury = 0;
                int iloscRzutow = 1;

                tabelaWynikow(wynikGracz1);
                System.out.println("(Kostka1: " + k1 + ")  (Kostka2: " + k2 + ")  (Kostka3: " + k3 + ")  (Kostka4: " + k4 + ")  (Kostka5: " + k5 + ")");

                while (wybranieFigury < 1) {
                    if (iloscRzutow <= 2) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("CCzy chcesz rzucić ponownie kośćmi? Tak wpisz 1, wybierz figurę wpisz 2");
                        int odpowiedz = scanner.nextInt();
                        if (odpowiedz == 1) {
                            iloscRzutow++;
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
                                        k1 = kostka11;
                                        break;
                                    case 2:
                                        int kostka22 = b.nextInt(5) + 1;
                                        k2 = kostka22;
                                        break;
                                    case 3:
                                        int kostka33 = b.nextInt(5) + 1;
                                        k3 = kostka33;
                                        break;
                                    case 4:
                                        int kostka44 = b.nextInt(5) + 1;
                                        k4 = kostka44;
                                        break;
                                    case 5:
                                        int kostka55 = b.nextInt(5) + 1;
                                        k5 = kostka55;
                                        break;
                                }
                            }
                            tabelaWynikow(wynikGracz1);
                            System.out.println("(Kostka1: " + k1 + ")  (Kostka2: " + k2 + ")  (Kostka3: " + k3 + ")  (Kostka4: " + k4 + ")  (Kostka5: " + k5 + ")");
                        } else if (odpowiedz == 2) {
                            wybranieFigury++;
                            System.out.println("Tabela wynikow gracza: " + gracz1);
                            tabelaWynikow(wynikGracz1);
                            System.out.println(gracz1 + " wyrzycił/a:");
                            System.out.println("(Kostka1: " + k1 + ")  (Kostka2: " + k2 + ")  (Kostka3: " + k3 + ")  (Kostka4: " + k4 + ")  (Kostka5: " + k5 + ")");
                            int[] tab = {k1, k2, k3, k4, k5};
                            wyborFigury(tab, wynikGracz1);
                        }
                    } else {
                        wybranieFigury++;
                        int[] tab = {k1, k2, k3, k4, k5};
                        wyborFigury(tab, wynikGracz1);
                    }

                }
            }

            for (int y = 0; y < 1; y++) {
                System.out.println("");
                System.out.println("");
                System.out.println("Rzuca gracz: " + gracz2);
                int k1 = a.nextInt(5) + 1;
                int k2 = b.nextInt(5) + 1;
                int k3 = c.nextInt(5) + 1;
                int k4 = d.nextInt(5) + 1;
                int k5 = e.nextInt(5) + 1;
                int wybranieFigury = 0;
                int iloscRzutow = 1;

                tabelaWynikow(wynikGracz2);
                System.out.println("(Kostka1: " + k1 + ")  (Kostka2: " + k2 + ")  (Kostka3: " + k3 + ")  (Kostka4: " + k4 + ")  (Kostka5: " + k5 + ")");

                while (wybranieFigury < 1) {
                    if (iloscRzutow <= 2) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("CCzy chcesz rzucić ponownie kośćmi? Tak wpisz 1, wybierz figurę wpisz 2");
                        int odpowiedz = scanner.nextInt();
                        if (odpowiedz == 1) {
                            iloscRzutow++;
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
                                        k1 = kostka11;
                                        break;
                                    case 2:
                                        int kostka22 = b.nextInt(5) + 1;
                                        k2 = kostka22;
                                        break;
                                    case 3:
                                        int kostka33 = b.nextInt(5) + 1;
                                        k3 = kostka33;
                                        break;
                                    case 4:
                                        int kostka44 = b.nextInt(5) + 1;
                                        k4 = kostka44;
                                        break;
                                    case 5:
                                        int kostka55 = b.nextInt(5) + 1;
                                        k5 = kostka55;
                                        break;
                                }
                            }
                            tabelaWynikow(wynikGracz2);
                            System.out.println("(Kostka1: " + k1 + ")  (Kostka2: " + k2 + ")  (Kostka3: " + k3 + ")  (Kostka4: " + k4 + ")  (Kostka5: " + k5 + ")");
                        } else if (odpowiedz == 2) {
                            wybranieFigury++;
                            System.out.println("Tabela wynikow gracza: " + gracz2);
                            tabelaWynikow(wynikGracz2);
                            System.out.println(gracz2 + " wyrzycił/a:");
                            System.out.println("(Kostka1: " + k1 + ")  (Kostka2: " + k2 + ")  (Kostka3: " + k3 + ")  (Kostka4: " + k4 + ")  (Kostka5: " + k5 + ")");
                            int[] tab = {k1, k2, k3, k4, k5};
                            wyborFigury(tab, wynikGracz2);
                        }
                    } else {
                        wybranieFigury++;
                        int[] tab = {k1, k2, k3, k4, k5};
                        wyborFigury(tab, wynikGracz2);
                    }

                }
            }
        }
        System.out.println("KONIEC GRY");
        if (wynikGracz1[16] > wynikGracz2[16]) {
            System.out.println("Gracz: " + gracz1 + " uzyskał/a " + wynikGracz1[16] + " i wygrał/a gre");
        } else if (wynikGracz1[16] < wynikGracz2[16]) {
            System.out.println("Gracz: " + gracz2 + " uzyskał/a " + wynikGracz2[16] + " i wygrał/a gre");
        } else {
            System.out.println("REMIS");
        }
    }


    public static void sort(int tab[]) {
        int temp;
        int zmiana = 1;

        while (zmiana > 0) {
            zmiana = 0;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                    zmiana++;
                }

            }
        }


    }


    public static void tabelaWynikow(int tab[]) {
        System.out.print("1 - Jedynki: " + tab[0]);
        System.out.println("        7 - trzy jednakowe: " + tab[8]);
        System.out.print("2 - dwójki: " + tab[1]);
        System.out.println("         8 - cztery jednakowe " + tab[9]);
        System.out.print("3 - trójki: " + tab[2]);
        System.out.println("         9 - full: " + tab[10]);
        System.out.print("4 - czwórki: " + tab[3]);
        System.out.println("        10 - mały strit: " + tab[11]);
        System.out.print("5 - piątki: " + tab[4]);
        System.out.println("        11 - duży strit: " + tab[12]);
        System.out.print("6 - szóstki: " + tab[5]);
        System.out.println("        12 - generał: " + tab[13]);
        System.out.print("Bonus: " + tab[6]);
        System.out.println("              13 - szansa: " + tab[14]);
        System.out.print("SUMA: " + tab[7]);
        System.out.println("               SUMA: " + tab[15]);
        System.out.println("RAZEM: " + tab[16]);

    }

    public static void wyborFigury(int tab[], int wynik[]) {
        sort(tab);
        System.out.println("Wybierz figurę");
        Scanner scanner3 = new Scanner(System.in);
        int figura = scanner3.nextInt();

        switch (figura) {
            case 1:
                if (tab[0] == 1 || tab[1] == 1 || tab[2] == 1 || tab[3] == 1 || tab[4] == 1) {
                    int sumaJedynek = 0;
                    for (int i = 0; i < tab.length; i++) {
                        if (tab[i] == 1) {
                            sumaJedynek++;
                        }
                    }
                    wynik[0] = sumaJedynek;
                    break;
                }
            case 2:
                if (tab[0] == 2 || tab[1] == 2 || tab[2] == 2 || tab[3] == 2 || tab[4] == 2) {
                    int sumaDwojek = 0;
                    for (int i = 0; i < tab.length; i++) {
                        if (tab[i] == 2) {
                            sumaDwojek++;
                        }
                    }
                    wynik[1] = sumaDwojek * 2;
                    break;
                }
            case 3:
                if (tab[0] == 3 || tab[1] == 3 || tab[2] == 3 || tab[3] == 3 || tab[4] == 3) {
                    int sumaTrojek = 0;
                    for (int i = 0; i < tab.length; i++) {
                        if (tab[i] == 3) {
                            sumaTrojek++;
                        }
                    }
                    wynik[2] = sumaTrojek * 3;
                    break;
                }
            case 4:
                if (tab[0] == 4 || tab[1] == 4 || tab[2] == 4 || tab[3] == 4 || tab[4] == 4) {
                    int sumaCzworek = 0;
                    for (int i = 0; i < tab.length; i++) {
                        if (tab[i] == 4) {
                            sumaCzworek++;
                        }
                    }
                    wynik[3] = sumaCzworek * 4;
                    break;
                }
            case 5:
                if (tab[0] == 5 || tab[1] == 5 || tab[2] == 5 || tab[3] == 5 || tab[4] == 5) {
                    int sumaPiatek = 0;
                    for (int i = 0; i < tab.length; i++) {
                        if (tab[i] == 5) {
                            sumaPiatek++;
                        }
                    }
                    wynik[4] = sumaPiatek * 5;
                    break;
                }
            case 6:
                if (tab[0] == 6 || tab[1] == 6 || tab[2] == 6 || tab[3] == 6 || tab[4] == 6) {
                    int sumaSzostek = 0;
                    for (int i = 0; i < tab.length; i++) {
                        if (tab[i] == 6) {
                            sumaSzostek++;
                        }
                    }
                    wynik[5] = sumaSzostek * 6;
                    break;
                }
            case 7:
                if ((tab[0] == tab[1] && tab[1] == tab[2]) || (tab[1] == tab[2] && tab[2] == tab[3]) || (tab[2] == tab[3] && tab[3] == tab[4])) {
                    wynik[8] = tab[0] + tab[1] + tab[2] + tab[3] + tab[4];
                    break;
                }
            case 8:
                if ((tab[0] == tab[1] && tab[1] == tab[2] && tab[2] == tab[3]) || (tab[1] == tab[2] && tab[2] == tab[3] && tab[3] == tab[4])) {
                    wynik[9] = tab[0] + tab[1] + tab[2] + tab[3] + tab[4];
                    break;
                }
            case 9:
                if (tab[0] == tab[1] && tab[2] == tab[3] && tab[3] == tab[4] || (tab[0] == tab[1] && tab[1] == tab[2] && tab[3] == tab[4])) {
                    wynik[10] = 25;
                    break;
                }
            case 10:
                if ((tab[0] == 1 && tab[1] == 1 && tab[2] == 2 && tab[3] == 3 && tab[4] == 4) || (tab[0] == 1 && tab[1] == 2 && tab[2] == 2 && tab[3] == 3 && tab[4] == 4) ||
                        (tab[0] == 1 && tab[1] == 2 && tab[2] == 3 && tab[3] == 3 && tab[4] == 4) || (tab[0] == 1 && tab[1] == 2 && tab[2] == 3 && tab[3] == 4 && tab[4] == 4) ||
                        (tab[0] == 1 && tab[1] == 2 && tab[2] == 3 && tab[3] == 4 && tab[4] == 5) || (tab[0] == 2 && tab[1] == 2 && tab[2] == 3 && tab[3] == 4 && tab[4] == 5) ||
                        (tab[0] == 2 && tab[1] == 3 && tab[2] == 3 && tab[3] == 4 && tab[4] == 5) || (tab[0] == 2 && tab[1] == 3 && tab[2] == 4 && tab[3] == 4 && tab[4] == 5) ||
                        (tab[0] == 2 && tab[1] == 3 && tab[2] == 4 && tab[3] == 5 && tab[4] == 5)) {
                    wynik[11] = 30;
                    break;
                }
            case 11:
                if ((tab[0] == 1 && tab[1] == 2 && tab[2] == 3 && tab[3] == 4 && tab[4] == 5) || (tab[0] == 2 && tab[1] == 3 && tab[2] == 4 && tab[3] == 5 && tab[4] == 6)) {
                    wynik[12] = 40;
                    break;
                }
            case 12:
                if (tab[0] == tab[1] && tab[1] == tab[2] && tab[2] == tab[3] && tab[3] == tab[4]) {
                    wynik[13] = 50;
                    break;
                }
            case 13:
                wynik[14] = tab[0] + tab[1] + tab[2] + tab[3] + tab[4];
                break;
        }
        wynik[7] = wynik[0] + wynik[1] + wynik[2] + wynik[3] + wynik[4] + wynik[5] + wynik[6];
        wynik[15] = wynik[8] + wynik[9] + wynik[10] + wynik[11] + wynik[12] + wynik[13] + wynik[14];
        wynik[16] = wynik[7] + wynik[15];
        if (wynik[0] + wynik[1] + wynik[2] + wynik[3] + wynik[4] + wynik[5] > 62) {
            wynik[6] = 35;
        }
    }
}

