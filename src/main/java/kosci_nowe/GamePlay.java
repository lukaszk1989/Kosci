package kosci_nowe;

import java.util.Random;
import java.util.Scanner;

public class GamePlay {
    private Player player1;
    private Player player2;

    public GamePlay(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private   void sort(int tab[]) {
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

    private   void tabelaWynikow(Player player) {
        System.out.print("1 - Jedynki: " + player.wynik[0]);
        System.out.println("        7 - trzy jednakowe: " + player.wynik[8]);
        System.out.print("2 - dwójki: " + player.wynik[1]);
        System.out.println("         8 - cztery jednakowe " + player.wynik[9]);
        System.out.print("3 - trójki: " + player.wynik[2]);
        System.out.println("         9 - full: " + player.wynik[10]);
        System.out.print("4 - czwórki: " + player.wynik[3]);
        System.out.println("        10 - mały strit: " + player.wynik[11]);
        System.out.print("5 - piątki: " + player.wynik[4]);
        System.out.println("        11 - duży strit: " + player.wynik[12]);
        System.out.print("6 - szóstki: " + player.wynik[5]);
        System.out.println("        12 - generał: " + player.wynik[13]);
        System.out.print("Bonus: " + player.wynik[6]);
        System.out.println("              13 - szansa: " + player.wynik[14]);
        System.out.print("SUMA: " + player.wynik[7]);
        System.out.println("               SUMA: " + player.wynik[15]);
        System.out.println("RAZEM: " + player.wynik[16]);

    }

    private void wyborFigury(Player player) {
        sort(player.kostki);
        int wybor = 0;
        while (wybor == 0) {
            System.out.println("Wybierz figurę");
            Scanner scanner = new Scanner(System.in);
            int figura = scanner.nextInt();
            if (player.sprawdzenie[figura - 1] == 0) {
                switch (figura) {
                    case 1:
                        if (player.kostki[0] == 1 || player.kostki[1] == 1 || player.kostki[2] == 1 || player.kostki[3] == 1 || player.kostki[4] == 1) {
                            int sumaJedynek = 0;
                            for (int i = 0; i < player.kostki.length; i++) {
                                if (player.kostki[i] == 1) {
                                    sumaJedynek++;
                                }
                            }
                            player.wynik[0] = sumaJedynek;
                            break;
                        } else {
                            player.wynik[0] = 0;
                            break;
                        }
                    case 2:
                        if (player.kostki[0] == 2 || player.kostki[1] == 2 || player.kostki[2] == 2 || player.kostki[3] == 2 || player.kostki[4] == 2) {
                            int sumaDwojek = 0;
                            for (int i = 0; i < player.kostki.length; i++) {
                                if (player.kostki[i] == 2) {
                                    sumaDwojek++;
                                }
                            }
                            player.wynik[1] = sumaDwojek * 2;
                            break;
                        } else {
                            player.wynik[1] = 0;
                            break;
                        }
                    case 3:
                        if (player.kostki[0] == 3 || player.kostki[1] == 3 || player.kostki[2] == 3 || player.kostki[3] == 3 || player.kostki[4] == 3) {
                            int sumaTrojek = 0;
                            for (int i = 0; i < player.kostki.length; i++) {
                                if (player.kostki[i] == 3) {
                                    sumaTrojek++;
                                }
                            }
                            player.wynik[2] = sumaTrojek * 3;
                            break;
                        } else {
                            player.wynik[2] = 0;
                            break;
                        }
                    case 4:
                        if (player.kostki[0] == 4 || player.kostki[1] == 4 || player.kostki[2] == 4 || player.kostki[3] == 4 || player.kostki[4] == 4) {
                            int sumaCzworek = 0;
                            for (int i = 0; i < player.kostki.length; i++) {
                                if (player.kostki[i] == 4) {
                                    sumaCzworek++;
                                }
                            }
                            player.wynik[3] = sumaCzworek * 4;
                            break;
                        } else {
                            player.wynik[3] = 0;
                            break;
                        }
                    case 5:
                        if (player.kostki[0] == 5 || player.kostki[1] == 5 || player.kostki[2] == 5 || player.kostki[3] == 5 || player.kostki[4] == 5) {
                            int sumaPiatek = 0;
                            for (int i = 0; i < player.kostki.length; i++) {
                                if (player.kostki[i] == 5) {
                                    sumaPiatek++;
                                }
                            }
                            player.wynik[4] = sumaPiatek * 5;
                            break;
                        } else {
                            player.wynik[4] = 0;
                            break;
                        }
                    case 6:
                        if (player.kostki[0] == 6 || player.kostki[1] == 6 || player.kostki[2] == 6 || player.kostki[3] == 6 || player.kostki[4] == 6) {
                            int sumaSzostek = 0;
                            for (int i = 0; i < player.kostki.length; i++) {
                                if (player.kostki[i] == 6) {
                                    sumaSzostek++;
                                }
                            }
                            player.wynik[5] = sumaSzostek * 6;
                            break;
                        } else {
                            player.wynik[5] = 0;
                            break;
                        }
                    case 7:
                        if ((player.kostki[0] == player.kostki[1] && player.kostki[1] == player.kostki[2]) || (player.kostki[1] == player.kostki[2] && player.kostki[2] == player.kostki[3]) || (player.kostki[2] == player.kostki[3] && player.kostki[3] == player.kostki[4])) {
                            player.wynik[8] = player.kostki[0] + player.kostki[1] + player.kostki[2] + player.kostki[3] + player.kostki[4];
                            break;
                        } else {
                            player.wynik[8] = 0;
                            break;
                        }
                    case 8:
                        if ((player.kostki[0] == player.kostki[1] && player.kostki[1] == player.kostki[2] && player.kostki[2] == player.kostki[3]) || (player.kostki[1] == player.kostki[2] && player.kostki[2] == player.kostki[3] && player.kostki[3] == player.kostki[4])) {
                            player.wynik[9] = player.kostki[0] + player.kostki[1] + player.kostki[2] + player.kostki[3] + player.kostki[4];
                            break;
                        } else {
                            player.wynik[9] = 0;
                            break;
                        }
                    case 9:
                        if (player.kostki[0] == player.kostki[1] && player.kostki[2] == player.kostki[3] && player.kostki[3] == player.kostki[4] || (player.kostki[0] == player.kostki[1] && player.kostki[1] == player.kostki[2] && player.kostki[3] == player.kostki[4])) {
                            player.wynik[10] = 25;
                            break;
                        } else {
                            player.wynik[10] = 0;
                            break;
                        }
                    case 10:
                        if ((player.kostki[0] == 1 && player.kostki[1] == 1 && player.kostki[2] == 2 && player.kostki[3] == 3 && player.kostki[4] == 4) || (player.kostki[0] == 1 && player.kostki[1] == 2 && player.kostki[2] == 2 && player.kostki[3] == 3 && player.kostki[4] == 4) ||
                                (player.kostki[0] == 1 && player.kostki[1] == 2 && player.kostki[2] == 3 && player.kostki[3] == 3 && player.kostki[4] == 4) || (player.kostki[0] == 1 && player.kostki[1] == 2 && player.kostki[2] == 3 && player.kostki[3] == 4 && player.kostki[4] == 4) ||
                                (player.kostki[0] == 1 && player.kostki[1] == 2 && player.kostki[2] == 3 && player.kostki[3] == 4 && player.kostki[4] == 5) || (player.kostki[0] == 2 && player.kostki[1] == 2 && player.kostki[2] == 3 && player.kostki[3] == 4 && player.kostki[4] == 5) ||
                                (player.kostki[0] == 2 && player.kostki[1] == 3 && player.kostki[2] == 3 && player.kostki[3] == 4 && player.kostki[4] == 5) || (player.kostki[0] == 2 && player.kostki[1] == 3 && player.kostki[2] == 4 && player.kostki[3] == 4 && player.kostki[4] == 5) ||
                                (player.kostki[0] == 2 && player.kostki[1] == 3 && player.kostki[2] == 4 && player.kostki[3] == 5 && player.kostki[4] == 5)) {
                            player.wynik[11] = 30;
                            break;
                        } else {
                            player.wynik[11] = 0;
                            break;
                        }
                    case 11:
                        if ((player.kostki[0] == 1 && player.kostki[1] == 2 && player.kostki[2] == 3 && player.kostki[3] == 4 && player.kostki[4] == 5) || (player.kostki[0] == 2 && player.kostki[1] == 3 && player.kostki[2] == 4 && player.kostki[3] == 5 && player.kostki[4] == 6)) {
                            player.wynik[12] = 40;
                            break;
                        } else {
                            player.wynik[12] = 0;
                            break;
                        }
                    case 12:
                        if (player.kostki[0] == player.kostki[1] && player.kostki[1] == player.kostki[2] && player.kostki[2] == player.kostki[3] && player.kostki[3] == player.kostki[4]) {
                            player.wynik[13] = 50;
                            break;
                        } else {
                            player.wynik[13] = 0;
                            break;
                        }
                    case 13:
                        if (player.sprawdzenie[12] == 0) {
                            player.wynik[14] = player.kostki[0] + player.kostki[1] + player.kostki[2] + player.kostki[3] + player.kostki[4];
                            break;
                        }
                }
                wybor++;
            } else {
                System.out.println("Figura była już wykorzystana. Wybierz jeszcze raz.");
            }
            player.sprawdzenie[figura - 1] = 1;
            player.wynik[7] = player.wynik[0] + player.wynik[1] + player.wynik[2] + player.wynik[3] + player.wynik[4] + player.wynik[5] + player.wynik[6];
            player.wynik[15] = player.wynik[8] + player.wynik[9] + player.wynik[10] + player.wynik[11] + player.wynik[12] + player.wynik[13] + player.wynik[14];
            player.wynik[16] = player.wynik[7] + player.wynik[15];
            if (player.wynik[0] + player.wynik[1] + player.wynik[2] + player.wynik[3] + player.wynik[4] + player.wynik[5] > 62) {
                player.wynik[6] = 35;
            }
        }
    }

    private   void rzut(Player player) {
        Random a = new Random();
        Scanner scanner = new Scanner(System.in);
        int k1 = a.nextInt(6) + 1;
        int k2 = a.nextInt(6) + 1;
        int k3 = a.nextInt(6) + 1;
        int k4 = a.nextInt(6) + 1;
        int k5 = a.nextInt(6) + 1;
        int wybranieFigury = 0;
        int iloscRzutow = 1;


        tabelaWynikow(player);
        System.out.println(player.getName() + " wyrzucił/a:");
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
                    tabelaWynikow(player);
                    System.out.println("(Kostka1: " + k1 + ")  (Kostka2: " + k2 + ")  (Kostka3: " + k3 + ")  (Kostka4: " + k4 + ")  (Kostka5: " + k5 + ")");
                } else if (odpowiedz == 2) {
                    wybranieFigury++;
                    System.out.println("Tabela wynikow gracza: " + player.getName());
                    tabelaWynikow(player);
                    System.out.println(player.getName() + " wyrzycił/a:");
                    System.out.println("(Kostka1: " + k1 + ")  (Kostka2: " + k2 + ")  (Kostka3: " + k3 + ")  (Kostka4: " + k4 + ")  (Kostka5: " + k5 + ")");
                    player.kostki = new int[]{k1, k2, k3, k4, k5};
                    wyborFigury(player);
                }
            } else {
                wybranieFigury++;
                player.kostki = new int[]{k1, k2, k3, k4, k5};
                wyborFigury(player);
            }
        }
    }

    public  void play(){
        for (int z = 0; z < 13; z++) {
            System.out.println("Rzuca gracz: " + player1.getName());

            rzut(player1);

            System.out.println("Rzuca gracz: " + player2.getName());
            rzut(player2);

        }
    }
}
