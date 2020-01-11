package kosci_nowe;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj imię gracza nr 1");
        Scanner scanner = new Scanner(System.in);
        String gracz1 = scanner.nextLine();
        System.out.println("Podaj imię gracza nr 2");
        String gracz2 = scanner.nextLine();

        Player player1 = new Player(gracz1);
        Player player2 = new Player(gracz2);

        GamePlay gamePlay = new GamePlay(player1, player2);
        gamePlay.play();


    }


}
