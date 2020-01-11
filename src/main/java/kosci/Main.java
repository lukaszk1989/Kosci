package kosci;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj imię gracza nr 1");
        Scanner scanner = new Scanner(System.in);
        String gracz1 = scanner.nextLine();
        System.out.println("Podaj imię gracza nr 2");
        String gracz2 = scanner.nextLine();

        Random a = new Random();

        int[] wynikGracz1 = new int[17];
        int[] sprawdzenieGracz1 = new int[13];
        int[] kostkiGracz1 = new int[5];


        int[] wynikGracz2 = new int[17];
        int[] sprawdzenieGracz2 = new int[13];
        int[] kostkiGracz2 = new int[5];


        for (int z = 0; z < 13; z++) {


            System.out.println("Rzuca gracz: " + gracz1);
            int k1 = a.nextInt(6) + 1;
            int k2 = a.nextInt(6) + 1;
            int k3 = a.nextInt(6) + 1;
            int k4 = a.nextInt(6) + 1;
            int k5 = a.nextInt(6) + 1;
            int wybranieFigury = 0;
            int iloscRzutow = 1;


            tabelaWynikow(wynikGracz1);
            System.out.println("(Kostka1: " + k1 + ")  (Kostka2: " + k2 + ")  (Kostka3: " + k3 + ")  (Kostka4: " + k4 + ")  (Kostka5: " + k5 + ")");

            while (wybranieFigury < 1) {
                if (iloscRzutow <= 2) {
                    System.out.println("Czy chcesz rzucić ponownie kośćmi? Tak wpisz 1, wybierz figurę wpisz 2");
                    int odpowiedz = scanner.nextInt();
                    if (odpowiedz == 1) {
                        iloscRzutow++;
                        System.out.println("Iloma kośćmi chcesz rzucić?");
                        int iloscKosci = scanner.nextInt();
                        System.out.println("Wpisz nr kosci i wcisnij enter");
                        for (int i = 0; i < iloscKosci; i++) {
                            int nrKosci = scanner.nextInt();
                            switch (nrKosci) {
                                case 1:
                                    int kostka11 = a.nextInt(6) + 1;
                                    k1 = kostka11;
                                    break;
                                case 2:
                                    int kostka22 = a.nextInt(6) + 1;
                                    k2 = kostka22;
                                    break;
                                case 3:
                                    int kostka33 = a.nextInt(6) + 1;
                                    k3 = kostka33;
                                    break;
                                case 4:
                                    int kostka44 = a.nextInt(6) + 1;
                                    k4 = kostka44;
                                    break;
                                case 5:
                                    int kostka55 = a.nextInt(6) + 1;
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
                        wyborFigury(tab, wynikGracz1, sprawdzenieGracz1);
                    }
                } else {
                    wybranieFigury++;
                    int[] tab = {k1, k2, k3, k4, k5};
                    wyborFigury(tab, wynikGracz1, sprawdzenieGracz1);
                }

            }


            System.out.println("");
            System.out.println("");
            System.out.println("Rzuca gracz: " + gracz2);
            int k11 = a.nextInt(6) + 1;
            int k22 = a.nextInt(6) + 1;
            int k33 = a.nextInt(6) + 1;
            int k44 = a.nextInt(6) + 1;
            int k55 = a.nextInt(6) + 1;
            int wybranieFigury1 = 0;
            int iloscRzutow1 = 1;

            tabelaWynikow(wynikGracz2);
            System.out.println("(Kostka1: " + k11 + ")  (Kostka2: " + k22 + ")  (Kostka3: " + k33 + ")  (Kostka4: " + k44 + ")  (Kostka5: " + k55 + ")");

            while (wybranieFigury < 1) {
                if (iloscRzutow <= 2) {
                    System.out.println("Czy chcesz rzucić ponownie kośćmi? Tak wpisz 1, wybierz figurę wpisz 2");
                    int odpowiedz = scanner.nextInt();
                    if (odpowiedz == 1) {
                        iloscRzutow1++;
                        System.out.println("Iloma kośćmi chcesz rzucić?");
                        int iloscKosci = scanner.nextInt();
                        System.out.println("Wpisz nr kosci i wcisnij enter");
                        for (int i = 0; i < iloscKosci; i++) {
                            int nrKosci = scanner.nextInt();
                            switch (nrKosci) {
                                case 1:
                                    int kostka11 = a.nextInt(6) + 1;
                                    k1 = kostka11;
                                    break;
                                case 2:
                                    int kostka22 = a.nextInt(6) + 1;
                                    k2 = kostka22;
                                    break;
                                case 3:
                                    int kostka33 = a.nextInt(6) + 1;
                                    k3 = kostka33;
                                    break;
                                case 4:
                                    int kostka44 = a.nextInt(6) + 1;
                                    k4 = kostka44;
                                    break;
                                case 5:
                                    int kostka55 = a.nextInt(6) + 1;
                                    k5 = kostka55;
                                    break;
                            }
                        }
                        tabelaWynikow(wynikGracz2);
                        System.out.println("(Kostka1: " + k1 + ")  (Kostka2: " + k2 + ")  (Kostka3: " + k3 + ")  (Kostka4: " + k4 + ")  (Kostka5: " + k5 + ")");
                    } else if (odpowiedz == 2) {
                        wybranieFigury1++;
                        System.out.println("Tabela wynikow gracza: " + gracz2);
                        tabelaWynikow(wynikGracz2);
                        System.out.println(gracz2 + " wyrzycił/a:");
                        System.out.println("(Kostka1: " + k1 + ")  (Kostka2: " + k2 + ")  (Kostka3: " + k3 + ")  (Kostka4: " + k4 + ")  (Kostka5: " + k5 + ")");
                        int[] tab = {k1, k2, k3, k4, k5};
                        wyborFigury(tab, wynikGracz2, sprawdzenieGracz2);
                    }
                } else {
                    wybranieFigury1++;
                    int[] tab = {k1, k2, k3, k4, k5};
                    wyborFigury(tab, wynikGracz2, sprawdzenieGracz2);
                }

            }

        }
        System.out.println("KONIEC GRY");
        if (wynikGracz1[16] > wynikGracz2[16]) {
            System.out.println("Gracz: " + gracz1 + " uzyskał/a " + wynikGracz1[16] + " pkt i wygrał/a gre.");
        } else if (wynikGracz1[16] < wynikGracz2[16]) {
            System.out.println("Gracz: " + gracz2 + " uzyskał/a " + wynikGracz2[16] + " pkt i wygrał/a gre.");
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



    public static void wyborFigury(int tab[], int wynik[], int sprawdzenie[]) {
        sort(tab);
        int wybor = 0;
        while (wybor == 0) {
            System.out.println("Wybierz figurę");
            Scanner scanner = new Scanner(System.in);
            int figura = scanner.nextInt();
            if (sprawdzenie[figura - 1] == 0) {
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
                        } else {
                            wynik[0] = 0;
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
                        } else {
                            wynik[1] = 0;
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
                        } else {
                            wynik[2] = 0;
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
                        } else {
                            wynik[3] = 0;
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
                        } else {
                            wynik[4] = 0;
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
                        } else {
                            wynik[5] = 0;
                            break;
                        }
                    case 7:
                        if ((tab[0] == tab[1] && tab[1] == tab[2]) || (tab[1] == tab[2] && tab[2] == tab[3]) || (tab[2] == tab[3] && tab[3] == tab[4])) {
                            wynik[8] = tab[0] + tab[1] + tab[2] + tab[3] + tab[4];
                            break;
                        } else {
                            wynik[8] = 0;
                            break;
                        }
                    case 8:
                        if ((tab[0] == tab[1] && tab[1] == tab[2] && tab[2] == tab[3]) || (tab[1] == tab[2] && tab[2] == tab[3] && tab[3] == tab[4])) {
                            wynik[9] = tab[0] + tab[1] + tab[2] + tab[3] + tab[4];
                            break;
                        } else {
                            wynik[9] = 0;
                            break;
                        }
                    case 9:
                        if (tab[0] == tab[1] && tab[2] == tab[3] && tab[3] == tab[4] || (tab[0] == tab[1] && tab[1] == tab[2] && tab[3] == tab[4])) {
                            wynik[10] = 25;
                            break;
                        } else {
                            wynik[10] = 0;
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
                        } else {
                            wynik[11] = 0;
                            break;
                        }
                    case 11:
                        if ((tab[0] == 1 && tab[1] == 2 && tab[2] == 3 && tab[3] == 4 && tab[4] == 5) || (tab[0] == 2 && tab[1] == 3 && tab[2] == 4 && tab[3] == 5 && tab[4] == 6)) {
                            wynik[12] = 40;
                            break;
                        } else {
                            wynik[12] = 0;
                            break;
                        }
                    case 12:
                        if (tab[0] == tab[1] && tab[1] == tab[2] && tab[2] == tab[3] && tab[3] == tab[4]) {
                            wynik[13] = 50;
                            break;
                        } else {
                            wynik[13] = 0;
                            break;
                        }
                    case 13:
                        if (sprawdzenie[12] == 0) {
                            wynik[14] = tab[0] + tab[1] + tab[2] + tab[3] + tab[4];
                            break;
                        }
                }
                wybor++;
            } else {
                System.out.println("Figura była już wykorzystana. Wybierz jeszcze raz.");
            }
            sprawdzenie[figura - 1] = 1;
            wynik[7] = wynik[0] + wynik[1] + wynik[2] + wynik[3] + wynik[4] + wynik[5] + wynik[6];
            wynik[15] = wynik[8] + wynik[9] + wynik[10] + wynik[11] + wynik[12] + wynik[13] + wynik[14];
            wynik[16] = wynik[7] + wynik[15];
            if (wynik[0] + wynik[1] + wynik[2] + wynik[3] + wynik[4] + wynik[5] > 62) {
                wynik[6] = 35;
            }
        }
    }


}





