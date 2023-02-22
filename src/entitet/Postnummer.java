package entitet;

public class Postnummer {
    private int postnummer;
    private String bynavn;

    public Postnummer(int postnummer, String bynavn) {
        this.postnummer = postnummer;
        this.bynavn = bynavn;
    }

    public int getPostnummer() {
        return postnummer;
    }

    public void setPostnummer(int postnummer) {
        this.postnummer = postnummer;
    }

    public String getBynavn() {
        return bynavn;
    }

    public void setBynavn(String bynavn) {
        this.bynavn = bynavn;
    }

    @Override
    public String toString() {
        return "Postnummer{" +
                "postnummer=" + postnummer +
                ", bynavn='" + bynavn + '\'' +
                '}';
    }
}
