package kosci_nowe;

public class Player {

    private int[] wynik = new int[17];
    private int[] sprawdzenie = new int[13];

    public void setKostki(int[] kostki) {
        this.kostki = kostki;
    }

    private int[] kostki = new int[5];
    private String name;

    public int[] getWynik() {
        return wynik;
    }

    public int[] getSprawdzenie() {
        return sprawdzenie;
    }

    public int[] getKostki() {
        return kostki;
    }

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
    }


}
