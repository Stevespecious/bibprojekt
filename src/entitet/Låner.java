package entitet;

public class Låner {
    private int idlåner;
    private String navn;
    private String adresse;
    private int postnummer;

    public Låner(int idlåner, String navn, String adresse, int postnummer) {
        this.idlåner = idlåner;
        this.navn = navn;
        this.adresse = adresse;
        this.postnummer = postnummer;
    }

    public int getIdlåner() {
        return idlåner;
    }

    public void setIdlåner(int idlåner) {
        this.idlåner = idlåner;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getPostnummer() {
        return postnummer;
    }

    public void setPostnummer(int postnummer) {
        this.postnummer = postnummer;
    }

    @Override
    public String toString() {
        return "Låner{" +
                "idlåner=" + idlåner +
                ", navn='" + navn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", postnummer=" + postnummer +
                '}';
    }
}
