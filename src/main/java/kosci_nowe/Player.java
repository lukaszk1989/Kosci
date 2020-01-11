package kosci_nowe;

public class Player {

    public Player(String name) {
        this.name = name;

    }

    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getWynik() {
        return wynik;
    }

    public int[] getSprawdzenie() {
        return sprawdzenie;
    }

    public int[] getKostki() {
        return kostki;
    }

    int[] wynik = new int[17];
    int[] sprawdzenie = new int[13];
    int[] kostki = new int[5];
}
